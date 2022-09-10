package defpackage;

import android.content.DialogInterface;
import android.view.View;
import com.google.android.apps.maps.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
/* compiled from: PG */
/* renamed from: avgo  reason: default package */
/* loaded from: classes2.dex */
public final class avgo<T> extends btrh<T> {
    private final int d;

    public avgo(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        String string;
        if (this.d != 0) {
            avgn avgnVar = (avgn) this.a;
            btlu btluVar = ((gds) obj).a;
            String A = avgnVar.f.A(bvjk.bC, btluVar, null);
            long x = avgnVar.f.x(bvjk.bD, btluVar, 0L);
            if (A == null || x <= 0) {
                return;
            }
            avmh avmhVar = avgnVar.g;
            avgf avgfVar = new avgf(avgnVar);
            if (A.isEmpty()) {
                string = avmhVar.a.getString(R.string.OFFLINE_AUTODOWNLOAD_DIALOG_BODY_INFERRED_FAST, new Object[]{Long.valueOf(x)});
            } else {
                string = avmhVar.a.getString(R.string.OFFLINE_AUTODOWNLOAD_DIALOG_BODY_FAST, new Object[]{A, Long.valueOf(x)});
            }
            czwe czweVar = new czwe(avmhVar.a);
            avmg avmgVar = new avmg(string, avgfVar, czweVar);
            final cqkf c = avmhVar.b.c(new avme(), null);
            c.e(avmgVar);
            czweVar.setContentView(c.c());
            View findViewById = czweVar.findViewById(R.id.design_bottom_sheet);
            dbsk.s(findViewById);
            BottomSheetBehavior.F(findViewById).y(3);
            czweVar.setOnDismissListener(new DialogInterface.OnDismissListener(c) { // from class: avly
                private final cqkf a;

                {
                    this.a = c;
                }

                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.a.e(null);
                }
            });
            czweVar.show();
            avgnVar.f.Q(bvjk.bC, btluVar);
            avgnVar.f.Q(bvjk.bD, btluVar);
            return;
        }
        avgn avgnVar2 = (avgn) this.a;
        avpp avppVar = (avpp) obj;
        avhz avhzVar = avgnVar2.k;
        new avgl(avgnVar2, null);
        avhzVar.b();
    }
}
