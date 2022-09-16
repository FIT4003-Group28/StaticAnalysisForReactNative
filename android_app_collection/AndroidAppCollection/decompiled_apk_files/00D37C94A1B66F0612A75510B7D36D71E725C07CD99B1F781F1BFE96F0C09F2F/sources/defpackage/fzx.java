package defpackage;

import android.content.res.Resources;
import android.view.View;
import com.google.android.youtube.R;
import java.util.LinkedList;
import java.util.List;
/* compiled from: PG */
/* renamed from: fzx  reason: default package */
/* loaded from: classes3.dex */
public final class fzx {
    public boolean a = false;
    public final List b = new LinkedList();
    private final gac c;

    public fzx(gac gacVar) {
        this.c = gacVar;
    }

    public static boolean g(asov asovVar) {
        if (asovVar == null || (asovVar.b & 1) == 0) {
            return false;
        }
        aspc aspcVar = asovVar.c;
        if (aspcVar == null) {
            aspcVar = aspc.a;
        }
        return !aspcVar.d.isEmpty();
    }

    private final void k(aspb aspbVar, aopc aopcVar) {
        for (fzv fzvVar : this.b) {
            fzvVar.e(aspbVar, aopcVar);
            fzvVar.a(fzvVar.d.getResources().getString(true != fzvVar.d(aspbVar) ? R.string.accessibility_save_to_playlists : R.string.accessibility_remove_from_playlists));
        }
    }

    public final void a(View view) {
        this.b.add(new fzw(view, true));
    }

    public final void b(View view) {
        this.b.add(new fzv(view, false));
    }

    public final void c(View view) {
        this.b.add(new fzw(view, false));
    }

    public final void d() {
        this.a = false;
    }

    public final void e() {
        this.a = true;
    }

    public final void f(aspb aspbVar) {
        k(aspbVar, null);
    }

    public final void h(aspb aspbVar, aopc aopcVar) {
        this.c.a(aspbVar, (asov) aopcVar.mo39build(), new fzt(this), new fzt(this, 1), new fzt(this));
    }

    public final void i(aopc aopcVar) {
        if (aopcVar == null) {
            for (fzv fzvVar : this.b) {
                fzvVar.c(8);
            }
            return;
        }
        for (fzv fzvVar2 : this.b) {
            fzvVar2.c(0);
            fzvVar2.b(((asov) aopcVar.instance).o);
            fzvVar2.d.setOnClickListener(new fzu(this, aopcVar, fzvVar2.c ? aspb.DISLIKE : aspb.LIKE));
        }
        if (g((asov) aopcVar.mo39build())) {
            k(abgb.c(aopcVar), aopcVar);
        } else {
            j(abgb.c(aopcVar), aopcVar);
        }
    }

    public final void j(aspb aspbVar, aopc aopcVar) {
        for (fzv fzvVar : this.b) {
            fzvVar.e(aspbVar, aopcVar);
            int[] iArr = !fzvVar.c ? fzv.a : fzv.b;
            Resources resources = fzvVar.d.getResources();
            int i = aopcVar == null ? 0 : !fzvVar.c ? ((asov) aopcVar.instance).e : ((asov) aopcVar.instance).i;
            fzvVar.a(fzvVar.d(aspbVar) ? i > 0 ? resources.getQuantityString(iArr[3], i, Integer.valueOf(i)) : resources.getString(iArr[1]) : i > 0 ? resources.getQuantityString(iArr[2], i, Integer.valueOf(i)) : resources.getString(iArr[0]));
        }
    }
}
