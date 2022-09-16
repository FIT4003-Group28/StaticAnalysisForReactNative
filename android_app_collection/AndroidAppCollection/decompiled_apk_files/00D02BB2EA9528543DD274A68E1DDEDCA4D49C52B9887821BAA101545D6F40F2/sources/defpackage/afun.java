package defpackage;

import android.content.DialogInterface;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: afun  reason: default package */
/* loaded from: classes2.dex */
final class afun implements DialogInterface.OnClickListener {
    final /* synthetic */ afuu a;

    public afun(afuu afuuVar) {
        this.a = afuuVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        afuu afuuVar = this.a;
        afuuVar.d.S(bvjk.E, true);
        afuuVar.d.S(bvjk.G, true);
        afuuVar.f.i(cjtd.a(dtyb.c));
        dialogInterface.cancel();
        final afuu afuuVar2 = this.a;
        final String string = afuuVar2.b.getResources().getString(R.string.SATELLITE_KEEP_ON_TOAST_MESSAGE);
        afuuVar2.u.execute(new Runnable(afuuVar2, string) { // from class: afuj
            private final afuu a;
            private final String b;

            {
                this.a = afuuVar2;
                this.b = string;
            }

            @Override // java.lang.Runnable
            public final void run() {
                afuu afuuVar3 = this.a;
                ckos.a(afuuVar3.b.findViewById(16908290), this.b, 0).c();
                afuuVar3.g.g().d(cjtd.a(dtyb.d));
            }
        });
    }
}
