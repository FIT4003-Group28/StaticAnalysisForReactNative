package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: fkj  reason: default package */
/* loaded from: classes3.dex */
public final class fkj implements ajru {
    private final wkb a;
    private final View b;
    private final wmk c;

    public fkj(Context context, ViewGroup viewGroup, wkb wkbVar, wmk wmkVar) {
        this.a = wkbVar;
        this.c = wmkVar;
        this.b = LayoutInflater.from(context).inflate(R.layout.watch_metadata_companion_cards, viewGroup, false);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        fkh fkhVar = (fkh) obj;
        wkh wkhVar = this.a.a;
        wkhVar.getClass();
        View view = this.b;
        wkhVar.l = view;
        wkhVar.m = ajrsVar;
        wke wkeVar = wkhVar.b;
        if (wkeVar != null) {
            wkeVar.d(view, ajrsVar);
        }
        wmk wmkVar = this.c;
        View view2 = this.b;
        for (wls wlsVar : wmkVar.a) {
            wlsVar.g(view2, ajrsVar);
        }
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        for (wls wlsVar : this.c.a) {
            wlsVar.f();
        }
    }
}
