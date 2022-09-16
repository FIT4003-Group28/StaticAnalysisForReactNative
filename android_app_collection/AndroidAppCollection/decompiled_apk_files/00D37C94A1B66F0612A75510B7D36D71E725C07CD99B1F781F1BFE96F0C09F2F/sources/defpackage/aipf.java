package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aipf  reason: default package */
/* loaded from: classes.dex */
final class aipf extends aenz {
    private final aipk b;
    private final FormatStreamModel c;

    public aipf(aeof aeofVar, aipk aipkVar, FormatStreamModel formatStreamModel) {
        super(aeofVar);
        this.b = aipkVar;
        this.c = formatStreamModel;
    }

    @Override // defpackage.aenz, defpackage.aeof
    public final void l(Context context, Uri uri, Map map, PlayerConfigModel playerConfigModel) {
        if (!zgt.n(uri)) {
            aipk aipkVar = this.b;
            FormatStreamModel formatStreamModel = this.c;
            String str = formatStreamModel.b;
            int e = formatStreamModel.e();
            String w = this.c.w();
            long j = this.c.j();
            long k = this.c.k();
            int i = aipg.a;
            aipi a = aipkVar.a("/exocache", str, e, w, j, k);
            a.b("s", uri.toString());
            uri = a.a();
        }
        this.a.l(context, uri, map, playerConfigModel);
    }
}
