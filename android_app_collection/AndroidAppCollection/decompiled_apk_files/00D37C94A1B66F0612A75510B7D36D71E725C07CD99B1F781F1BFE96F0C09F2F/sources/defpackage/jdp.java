package defpackage;

import android.content.DialogInterface;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: jdp  reason: default package */
/* loaded from: classes3.dex */
final class jdp implements DialogInterface.OnClickListener {
    final /* synthetic */ jdy a;
    private final /* synthetic */ int b;

    public jdp(jdy jdyVar) {
        this.a = jdyVar;
    }

    public jdp(jdy jdyVar, int i) {
        this.b = i;
        this.a = jdyVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.b;
        if (i2 == 0) {
            ahay ahayVar = this.a.s;
            if (ahayVar == null) {
                return;
            }
            if (i != 0) {
                if (i != 1) {
                    return;
                }
                ahayVar.b.h(ahayVar.a);
            } else if (!ahayVar.b.b.o()) {
                ahayVar.b.c.b();
            } else if (!ahayVar.b.d().A(ahayVar.a, ahayVar.b.d.b())) {
            } else {
                ahayVar.b.c(R.string.sync_playlist_start);
            }
        } else if (i2 == 1) {
            ahdb ahdbVar = this.a.p;
            if (ahdbVar == null) {
                return;
            }
            ahdbVar.a();
        } else if (i2 != 2) {
            ahdb ahdbVar2 = this.a.o;
            if (ahdbVar2 == null) {
                return;
            }
            ahdbVar2.a();
        } else {
            ahaz ahazVar = this.a.r;
            if (ahazVar == null) {
                return;
            }
            ahazVar.b.d().o(ahazVar.a);
            ahazVar.b.c(R.string.sync_playlist_start);
        }
    }
}
