package defpackage;

import com.google.android.apps.youtube.app.ui.pivotbar.PivotBar;
import com.google.android.youtube.R;
import j$.util.Optional;
import java.util.Map;
import java.util.MissingFormatArgumentException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: mej  reason: default package */
/* loaded from: classes3.dex */
public final class mej implements zdx {
    public final azpx a;
    public final aypf b;
    public final zap c;
    public final zap d;
    public final Map e;
    final /* synthetic */ PivotBar f;

    public mej(PivotBar pivotBar, zap zapVar, zap zapVar2, Map map) {
        this.f = pivotBar;
        azpx aO = azpm.aI(Optional.empty()).aO();
        this.a = aO;
        this.c = zapVar;
        this.d = zapVar2;
        this.e = map;
        this.b = new aypf(aO.V(lyd.k).as(new meh(this)), aO.V(lyd.j).as(new meh(this, 1)), aO.I(kth.j).V(lyd.i).I(kth.i).V(lyd.h).as(new meh(this, 2)));
    }

    public final CharSequence a(int i) {
        try {
            if (i <= 9) {
                return this.f.a.getQuantityString(R.plurals.tab_extra_info_new_items, i, Integer.valueOf(i));
            }
            return this.f.a.getString(R.string.tab_extra_info_nine_plus_new_items);
        } catch (MissingFormatArgumentException unused) {
            return b();
        }
    }

    public final CharSequence b() {
        return this.f.a.getString(R.string.tab_extra_info_new_content);
    }

    @Override // defpackage.zdx
    public final void j() {
        throw null;
    }
}
