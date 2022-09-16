package defpackage;

import android.net.Uri;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cdzn  reason: default package */
/* loaded from: classes4.dex */
final class cdzn<T> implements aa<Map<Uri, ? extends String>> {
    final /* synthetic */ ceae a;

    public cdzn(ceae ceaeVar) {
        this.a = ceaeVar;
    }

    @Override // defpackage.aa
    public final /* bridge */ /* synthetic */ void m(Map<Uri, ? extends String> map) {
        ceae.aT(this.a).y(dzti.i(dzti.f(map.keySet()), ceae.aT(this.a).f));
    }
}
