package defpackage;

import android.content.Context;
import java.io.File;
/* compiled from: PG */
/* renamed from: aaat  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aaat implements amqo {
    public final /* synthetic */ aaau a;
    private final /* synthetic */ int b;

    public /* synthetic */ aaat(aaau aaauVar) {
        this.a = aaauVar;
    }

    public /* synthetic */ aaat(aaau aaauVar, int i) {
        this.b = i;
        this.a = aaauVar;
    }

    @Override // defpackage.amqo
    public final Object get() {
        int i = this.b;
        File file = null;
        if (i == 0) {
            aaau aaauVar = this.a;
            Context context = aaauVar.e;
            if (context != null) {
                file = context.getFilesDir();
            }
            return new aaqd(aaauVar.a, aaauVar.b, aaauVar.c, aaauVar.d, file);
        } else if (i == 1) {
            aaau aaauVar2 = this.a;
            aaqd b = aaauVar2.b();
            ywk ywkVar = aaauVar2.d;
            if (ywkVar == null || ((ywkVar.c(ywk.C) & 8) == 0 && aaauVar2.d.c(ywk.E) == 0)) {
                return new aacz(b.b, null, b);
            }
            return new aacz(b.b, b.c, b);
        } else {
            aaau aaauVar3 = this.a;
            aadd aaddVar = new aadd(aaauVar3.b().a, aaauVar3.b());
            aapd.e = aaddVar;
            return aaddVar;
        }
    }
}
