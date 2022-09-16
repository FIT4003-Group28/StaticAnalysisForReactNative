package defpackage;

import android.content.Context;
import java.io.File;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: zte  reason: default package */
/* loaded from: classes4.dex */
public final class zte {
    public znh a;
    public final Context b;
    public final Executor c;
    public final snc d;

    public zte(Context context, snc sncVar, Executor executor) {
        this.b = context;
        this.c = executor;
        this.d = sncVar;
    }

    public final void a(final String str, final byte[] bArr, final ztd ztdVar) {
        this.c.execute(new Runnable() { // from class: ztb
            @Override // java.lang.Runnable
            public final void run() {
                zte zteVar = zte.this;
                String str2 = str;
                ztd ztdVar2 = ztdVar;
                byte[] bArr2 = bArr;
                znh znhVar = zteVar.a;
                if (znhVar == null) {
                    return;
                }
                File file = znhVar.a;
                if (file == null || !file.exists() || !new File(file, str2).exists()) {
                    ztdVar2.a(zteVar.a.b(str2, bArr2));
                } else {
                    ztdVar2.a(true);
                }
            }
        });
    }
}
