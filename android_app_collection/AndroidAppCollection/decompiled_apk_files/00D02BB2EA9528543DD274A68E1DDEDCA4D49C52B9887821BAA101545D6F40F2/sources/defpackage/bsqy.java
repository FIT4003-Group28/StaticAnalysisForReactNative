package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bsqy  reason: default package */
/* loaded from: classes4.dex */
class bsqy implements bssm {
    private final Resources a;
    private final cqat b;
    @dzsi
    private final byee c;

    public bsqy(brlu brluVar, Resources resources, cqat cqatVar) {
        byee byeeVar;
        ilo d;
        this.a = resources;
        this.b = cqatVar;
        int i = 0;
        while (true) {
            if (i >= brluVar.E()) {
                byeeVar = null;
                break;
            } else if (brluVar.D(i).c() && (d = brluVar.D(i).d()) != null && d.al().d()) {
                byeeVar = d.al();
                break;
            } else {
                i++;
            }
        }
        this.c = byeeVar;
    }

    @Override // defpackage.bssm
    public CharSequence a() {
        String b;
        byee byeeVar = this.c;
        return (byeeVar == null || (b = byeeVar.g(this.b).b()) == null) ? "" : this.a.getString(R.string.MIGHT_AFFECT_OPENING_HOURS, b);
    }

    @Override // defpackage.bssm
    public Boolean b() {
        byee byeeVar = this.c;
        if (byeeVar == null) {
            return false;
        }
        return Boolean.valueOf(byeeVar.g(this.b).d());
    }
}
