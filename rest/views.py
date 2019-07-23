from rest_framework import generics
from .models import Livro
from .serializers import LivroSerializer
from django.http import HttpResponse

# Create your views here.
class LivroList(generics.ListCreateAPIView):

    queryset = Livro.objects.all()
    serializer_class = LivroSerializer


def teste(request):
    return HttpResponse('teste')
