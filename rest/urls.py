from .views import LivroList, teste
from django.urls import path


urlpatterns = [
    path('livros/', LivroList.as_view(), name='api-livro'),
    path('teste/', teste)
]
