package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.red.presenter.NavigationDropdownView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ktn  reason: default package */
/* loaded from: classes3.dex */
public final class ktn implements ajru, ktt {
    public final aafo a;
    public final gbq b;
    public final NavigationDropdownView c;
    public akaf d;
    private final Context e;
    private final Resources f;
    private final View g;
    private final View h;
    private final View i;
    private final View j;
    private boolean k;

    public ktn(Context context, aafo aafoVar, gbq gbqVar) {
        this.e = context;
        this.a = aafoVar;
        this.b = gbqVar;
        this.f = context.getResources();
        View inflate = LayoutInflater.from(context).inflate(R.layout.episodes_section_header_layout, (ViewGroup) null);
        this.g = inflate;
        NavigationDropdownView navigationDropdownView = (NavigationDropdownView) inflate.findViewById(R.id.season_picker);
        this.c = navigationDropdownView;
        navigationDropdownView.g = this;
        this.h = navigationDropdownView.findViewById(R.id.dropdown_header);
        this.i = navigationDropdownView.findViewById(R.id.dropdown_items);
        this.j = navigationDropdownView.findViewById(R.id.bottom_divider);
        this.k = false;
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.g;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.ajru
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void oK(defpackage.ajrs r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ktn.oK(ajrs, java.lang.Object):void");
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.c.b(false);
    }
}
