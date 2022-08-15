export class Estudio{
    public idEstudio? : number;
    public titulo;
    public intitucion;
    public anioingreso;
    public anioegreso;
    public urlimgestudio;

    constructor(tit: String, int: String, anioi: String, anioe: String, url: String){
        this.titulo = tit;
        this.intitucion = int;
        this.anioingreso = anioi;
        this.anioegreso = anioe;
        this.urlimgestudio = url;
    }
}

