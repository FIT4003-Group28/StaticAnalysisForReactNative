package com.google.ar.sceneform.rendering;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class Texture {
    public static final String a = "Texture";
    public final TextureInternalData b;

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public class Sampler {
        public final MinFilter a;
        public final MagFilter b;
        public final WrapMode c;
        public final WrapMode d;
        public final WrapMode e;

        /* compiled from: PG */
        /* loaded from: classes5.dex */
        public enum MagFilter {
            NEAREST,
            LINEAR
        }

        /* compiled from: PG */
        /* loaded from: classes5.dex */
        public enum MinFilter {
            NEAREST,
            LINEAR,
            NEAREST_MIPMAP_NEAREST,
            LINEAR_MIPMAP_NEAREST,
            NEAREST_MIPMAP_LINEAR,
            LINEAR_MIPMAP_LINEAR
        }

        /* compiled from: PG */
        /* loaded from: classes5.dex */
        public enum WrapMode {
            CLAMP_TO_EDGE,
            REPEAT,
            MIRRORED_REPEAT
        }

        public Sampler(dbic dbicVar) {
            this.a = dbicVar.a;
            this.b = dbicVar.b;
            this.c = dbicVar.c;
            this.d = dbicVar.d;
            this.e = dbicVar.e;
        }

        public static dbic a() {
            dbic dbicVar = new dbic();
            dbicVar.a = MinFilter.LINEAR_MIPMAP_LINEAR;
            dbicVar.b = MagFilter.LINEAR;
            dbicVar.b(WrapMode.CLAMP_TO_EDGE);
            return dbicVar;
        }
    }

    public Texture(TextureInternalData textureInternalData) {
        this.b = textureInternalData;
        textureInternalData.b();
        dbhs.b().j.a(this, new dbib(textureInternalData));
    }

    public static dbia a() {
        dbix.b();
        return new dbia();
    }
}
