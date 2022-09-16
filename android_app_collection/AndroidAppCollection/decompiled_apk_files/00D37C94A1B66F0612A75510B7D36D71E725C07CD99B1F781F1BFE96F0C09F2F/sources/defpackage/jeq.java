package defpackage;

import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Collections;
/* compiled from: PG */
/* renamed from: jeq  reason: default package */
/* loaded from: classes3.dex */
final class jeq implements yiw {
    final /* synthetic */ attp a;
    final /* synthetic */ amuk b;
    final /* synthetic */ acti c;
    final /* synthetic */ String d;
    final /* synthetic */ String e;
    final /* synthetic */ amuk f;
    final /* synthetic */ jer g;

    public jeq(jer jerVar, attp attpVar, amuk amukVar, acti actiVar, String str, String str2, amuk amukVar2) {
        this.g = jerVar;
        this.a = attpVar;
        this.b = amukVar;
        this.c = actiVar;
        this.d = str;
        this.e = str2;
        this.f = amukVar2;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        ahcs ahcsVar = (ahcs) obj;
        if (!(exc instanceof ahcp)) {
            return;
        }
        ahcp ahcpVar = (ahcp) exc;
        if (ahcpVar.b) {
            ArrayList arrayList = new ArrayList(this.f);
            Collections.sort(arrayList, ahdp.f);
            this.g.c(this.a, amuk.o(amuk.o(arrayList)), this.b, this.c, this.d, this.e);
            return;
        }
        atsd atsdVar = ahcpVar.c;
        if (atsdVar != null) {
            this.g.b.c(atsdVar, this.c);
            return;
        }
        String str = ahcpVar.a;
        if (str != null) {
            zag.r(this.g.a, str, 1);
        } else {
            zag.q(this.g.a, R.string.offline_stream_selection_error, 1);
        }
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        ahcs ahcsVar = (ahcs) obj;
        ahct ahctVar = (ahct) obj2;
        ArrayList arrayList = new ArrayList(ahctVar.a);
        Collections.sort(arrayList, ahdp.f);
        this.g.c(this.a, amuk.o(amuk.o(arrayList)), this.b, this.c, this.d, this.e);
        byte[] bArr = ahctVar.b;
        if (bArr != null) {
            this.c.D(new acte(bArr));
        }
        jer.a(this.a, this.c);
    }
}
