package defpackage;

import android.content.Context;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: col  reason: default package */
/* loaded from: classes2.dex */
public final class col implements cnq {
    private final Context a;
    private final /* synthetic */ int b;

    public col(Context context) {
        this.a = context.getApplicationContext();
    }

    public col(Context context, int i) {
        this.b = i;
        this.a = context;
    }

    public col(Context context, int i, byte[] bArr) {
        this.b = i;
        this.a = context.getApplicationContext();
    }

    @Override // defpackage.cnq
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        int i = this.b;
        if (i == 0) {
            Uri uri = (Uri) obj;
            return acz.e(uri) && !acz.g(uri);
        } else if (i == 1) {
            return acz.e((Uri) obj);
        } else {
            Uri uri2 = (Uri) obj;
            return acz.e(uri2) && acz.g(uri2);
        }
    }

    @Override // defpackage.cnq
    public final /* bridge */ /* synthetic */ cnp a(Object obj, int i, int i2, cic cicVar) {
        Long l;
        int i3 = this.b;
        if (i3 == 0) {
            Uri uri = (Uri) obj;
            if (!acz.f(i, i2)) {
                return null;
            }
            cup cupVar = new cup(uri);
            Context context = this.a;
            return new cnp(cupVar, cje.f(context, uri, new cjc(context.getContentResolver())));
        } else if (i3 == 1) {
            Uri uri2 = (Uri) obj;
            return new cnp(new cup(uri2), new cnk(this.a, uri2));
        } else {
            Uri uri3 = (Uri) obj;
            if (!acz.f(i, i2) || (l = (Long) cicVar.b(cql.a)) == null || l.longValue() != -1) {
                return null;
            }
            cup cupVar2 = new cup(uri3);
            Context context2 = this.a;
            return new cnp(cupVar2, cje.f(context2, uri3, new cjd(context2.getContentResolver())));
        }
    }
}
