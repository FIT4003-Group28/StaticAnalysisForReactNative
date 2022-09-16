package defpackage;

import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: jdu  reason: default package */
/* loaded from: classes3.dex */
final class jdu implements yiw {
    final /* synthetic */ int a;
    final /* synthetic */ attp b;
    final /* synthetic */ acti c;
    final /* synthetic */ List d;
    final /* synthetic */ jdy e;

    public jdu(jdy jdyVar, int i, attp attpVar, acti actiVar, List list) {
        this.e = jdyVar;
        this.a = i;
        this.b = attpVar;
        this.c = actiVar;
        this.d = list;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        ahcq ahcqVar = (ahcq) obj;
        if (!(exc instanceof ahcp)) {
            return;
        }
        ahcp ahcpVar = (ahcp) exc;
        if (ahcpVar.b) {
            ArrayList arrayList = new ArrayList(this.d);
            Collections.sort(arrayList, this.e.b.f());
            this.e.b(this.a, arrayList);
            this.e.e(this.b);
            return;
        }
        atsd atsdVar = ahcpVar.c;
        if (atsdVar != null) {
            this.e.c(atsdVar, this.c);
            return;
        }
        String str = ahcpVar.a;
        if (str != null) {
            zag.r(this.e.a, str, 1);
        } else {
            zag.q(this.e.a, R.string.offline_stream_selection_error, 1);
        }
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        ahcq ahcqVar = (ahcq) obj;
        ahcr ahcrVar = (ahcr) obj2;
        ArrayList arrayList = new ArrayList(ahcrVar.a);
        Collections.sort(arrayList, this.e.b.f());
        this.e.b(this.a, arrayList);
        this.e.e(this.b);
        byte[] bArr = ahcrVar.b;
        if (bArr != null) {
            this.c.D(new acte(bArr));
        }
        jdy.t(this.b, this.c);
    }
}
