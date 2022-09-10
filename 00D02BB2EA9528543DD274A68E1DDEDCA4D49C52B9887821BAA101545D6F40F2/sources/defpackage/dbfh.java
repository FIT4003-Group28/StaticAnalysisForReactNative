package defpackage;

import com.google.android.filament.Texture;
import com.google.ar.sceneform.rendering.EngineInstance;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: dbfh  reason: default package */
/* loaded from: classes5.dex */
public final class dbfh {
    public static final String a = "dbfh";
    public static final int[] b = {3, 0, 4, 1, 5, 2};
    public Texture c;
    public final dbep d;
    public final dbep e;
    public float[] f;
    public String g;
    public dbiy h;
    public final float i;
    public float j;

    public dbfh(dbfg dbfgVar) {
        ByteBuffer.allocate(10000);
        this.c = null;
        this.d = new dbep((byte[]) null);
        this.e = new dbep();
        this.g = null;
        this.h = new dbiy();
        this.j = 1.0f;
        this.i = 220.0f;
        this.g = dbfgVar.c;
    }

    public final void a() {
        dbix.a();
        b(null);
        this.h = new dbiy();
    }

    public final void b(Texture texture) {
        Texture texture2 = this.c;
        dbet a2 = EngineInstance.a();
        if (texture2 != null && a2 != null && a2.a()) {
            a2.j(texture2);
        }
        this.c = texture;
    }

    protected final void finalize() {
        try {
            dbie.a().execute(new Runnable(this) { // from class: dbfd
                private final dbfh a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a();
                }
            });
        } catch (Exception unused) {
        } finally {
            super.finalize();
        }
    }
}
