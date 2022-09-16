package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: tyi  reason: default package */
/* loaded from: classes4.dex */
public final class tyi {
    public final Executor a;
    final HashMap b = new HashMap();
    private final Context c;
    private final amqo d;
    private final vjb e;
    private final tzq f;
    private final ampq g;
    private final tqe h;

    public tyi(Context context, amqo amqoVar, vjb vjbVar, tzq tzqVar, ampq ampqVar, Executor executor, tqe tqeVar) {
        this.c = context;
        this.d = amqoVar;
        this.e = vjbVar;
        this.f = tzqVar;
        this.g = ampqVar;
        this.a = executor;
        this.h = tqeVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:3|(2:5|(3:7|8|9))|11|12|13|14|(5:16|(1:18)|19|(2:21|(1:23)(1:24))(1:26)|25)|27|(6:29|cc|34|(3:36|ed|41)|46|(2:48|(8:50|(1:99)(1:56)|(1:58)|59|(2:62|60)|63|64|(4:66|(1:68)|69|(12:80|(1:82)|83|(1:85)|86|(1:88)|89|(1:91)|92|(1:94)|95|96)(3:79|8|9))(2:97|98))(2:100|101))(2:102|103))(2:108|109)) */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x021c, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x021d, code lost:
        defpackage.typ.d("%s: Not enough space to download file %s", "MddFileDownloader", r20);
        r0 = defpackage.anlz.p(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004b, code lost:
        r7 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ankt a(defpackage.tqv r17, int r18, final android.net.Uri r19, java.lang.String r20, int r21, defpackage.tqp r22, final defpackage.tyh r23, int r24, java.util.List r25) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tyi.a(tqv, int, android.net.Uri, java.lang.String, int, tqp, tyh, int, java.util.List):ankt");
    }

    public final void b(Uri uri) {
        ankt anktVar = (ankt) this.b.get(uri);
        if (anktVar != null) {
            int i = typ.a;
            this.b.remove(uri);
            anktVar.cancel(true);
            return;
        }
        typ.g("%s: stopDownloading on non-existent download", "MddFileDownloader");
    }
}
