package defpackage;

import android.net.Uri;
import java.io.InputStream;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: uay  reason: default package */
/* loaded from: classes4.dex */
public final class uay {
    public final vjb a;
    private final Executor b;

    public uay(Executor executor, vjb vjbVar) {
        this.b = executor;
        this.a = vjbVar;
    }

    public final ankt a(uau uauVar, int i) {
        final Uri parse;
        if (i == 0) {
            parse = Uri.parse(uauVar.b);
        } else if (i == 1) {
            parse = Uri.parse(uauVar.c);
        } else if (i == 2) {
            parse = Uri.parse(uauVar.d);
        } else {
            parse = Uri.parse(uauVar.e);
        }
        return anlz.v(new aniq() { // from class: uax
            @Override // defpackage.aniq
            public final ankt a() {
                uay uayVar = uay.this;
                return anlz.q((InputStream) uayVar.a.c(parse, vkk.b()));
            }
        }, this.b);
    }
}
