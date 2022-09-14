package defpackage;

import com.google.android.filament.TextureSampler;
/* compiled from: PG */
/* renamed from: dbfs  reason: default package */
/* loaded from: classes5.dex */
public final class dbfs {
    static {
        TextureSampler.WrapMode wrapMode = TextureSampler.WrapMode.CLAMP_TO_EDGE;
    }

    public static int a(dbjh dbjhVar) {
        int d = dbjhVar.d();
        int i = 0;
        for (int i2 = 0; i2 < d; i2++) {
            switch (dbjhVar.c(i2).b()) {
                case 1:
                case 5:
                case 7:
                    i += 4;
                    break;
                case 2:
                case 6:
                    i += 8;
                    break;
                case 3:
                    i += 12;
                    break;
                case 4:
                    i += 16;
                    break;
            }
        }
        return i;
    }
}
