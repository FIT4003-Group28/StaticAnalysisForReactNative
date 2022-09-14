package defpackage;

import android.net.Uri;
import com.google.android.filament.IndexBuffer;
import com.google.android.filament.TextureSampler;
import com.google.ar.sceneform.rendering.Material;
import com.google.ar.sceneform.rendering.MaterialParameters;
import com.google.ar.sceneform.rendering.Texture;
import defpackage.dbhe;
import java.nio.ByteBuffer;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dbfr  reason: default package */
/* loaded from: classes5.dex */
public final class dbfr<T extends dbhe> {
    private static final String t = "dbfr";
    public final T a;
    public final dbho b;
    public final Uri c;
    public dbjf d;
    public dbjh e;
    public dbki f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public IndexBuffer.Builder.IndexType l;
    public ByteBuffer m;
    public ByteBuffer n;
    public final ArrayList<dbfq> o = new ArrayList<>();
    public final ArrayList<Material> p = new ArrayList<>();
    public final ArrayList<Integer> q = new ArrayList<>();
    public final ArrayList<MaterialParameters> r = new ArrayList<>();
    public final ArrayList<String> s = new ArrayList<>();

    public dbfr(T t2, Uri uri) {
        this.a = t2;
        dbex dbexVar = t2.c;
        if (!(dbexVar instanceof dbho)) {
            String valueOf = String.valueOf(t);
            throw new IllegalStateException(valueOf.length() != 0 ? "Expected task type ".concat(valueOf) : new String("Expected task type "));
        }
        this.b = (dbho) dbexVar;
        this.c = uri;
    }

    public static int a(int i) {
        switch (i) {
            case 0:
                return 0;
            case 1:
                return 4;
            case 2:
                return 8;
            case 3:
                return 12;
            case 4:
                return 16;
            case 5:
                return 4;
            case 6:
                return 8;
            case 7:
                return 4;
            default:
                StringBuilder sb = new StringBuilder(50);
                sb.append("Unsupported VertexAttributeType value: ");
                sb.append(i);
                throw new AssertionError(sb.toString());
        }
    }

    public static Texture.Sampler.WrapMode b(TextureSampler.WrapMode wrapMode) {
        TextureSampler.WrapMode wrapMode2 = TextureSampler.WrapMode.CLAMP_TO_EDGE;
        TextureSampler.MinFilter minFilter = TextureSampler.MinFilter.NEAREST;
        TextureSampler.MagFilter magFilter = TextureSampler.MagFilter.NEAREST;
        int ordinal = wrapMode.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return Texture.Sampler.WrapMode.REPEAT;
            }
            if (ordinal == 2) {
                return Texture.Sampler.WrapMode.MIRRORED_REPEAT;
            }
            throw new IllegalArgumentException("Invalid WrapMode");
        }
        return Texture.Sampler.WrapMode.CLAMP_TO_EDGE;
    }
}
