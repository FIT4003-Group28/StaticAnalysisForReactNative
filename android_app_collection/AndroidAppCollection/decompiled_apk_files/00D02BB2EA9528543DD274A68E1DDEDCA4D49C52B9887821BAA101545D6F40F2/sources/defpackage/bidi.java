package defpackage;

import android.content.DialogInterface;
import android.widget.Toast;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: bidi  reason: default package */
/* loaded from: classes3.dex */
final class bidi implements DialogInterface.OnClickListener {
    final /* synthetic */ bidk a;

    public bidi(bidk bidkVar) {
        this.a = bidkVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        final bidk bidkVar = this.a;
        deha.q(bidkVar.b.x().f(bidkVar.e, bidkVar.i(true)), bvqj.b(new bvqg(bidkVar) { // from class: bicx
            private final bidk a;

            {
                this.a = bidkVar;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                bidk bidkVar2 = this.a;
                if (((Boolean) obj).booleanValue()) {
                    bidn bidnVar = bidkVar2.h;
                    azvo azvoVar = bidkVar2.e;
                    ArrayList arrayList = new ArrayList(bidnVar.a);
                    arrayList.remove(azvoVar);
                    ilo c = bidnVar.b.a.c();
                    dbsk.s(c);
                    ily g = c.g();
                    g.C = arrayList;
                    bidnVar.b.a.d(g.d());
                    cqkx.p(bidnVar.b);
                    return;
                }
                Toast.makeText(bidkVar2.a, (int) R.string.CONTACT_DELETION_ERROR_MESSAGE, 0).show();
            }
        }), bidkVar.d.h());
    }
}
