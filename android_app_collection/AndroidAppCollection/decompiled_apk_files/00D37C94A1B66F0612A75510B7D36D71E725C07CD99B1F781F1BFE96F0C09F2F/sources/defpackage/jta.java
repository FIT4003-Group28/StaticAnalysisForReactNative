package defpackage;

import android.view.MenuItem;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ApplicationSettingsEndpointOuterClass;
/* compiled from: PG */
/* renamed from: jta  reason: default package */
/* loaded from: classes3.dex */
public final class jta implements fry {
    private final aafo a;

    public jta(aafo aafoVar) {
        this.a = aafoVar;
    }

    @Override // defpackage.fry
    public final int g() {
        return R.id.menu_settings;
    }

    @Override // defpackage.fry
    public final int h() {
        return R.menu.menu_settings;
    }

    @Override // defpackage.fry
    public final frx i() {
        return null;
    }

    @Override // defpackage.fry
    public final void j(MenuItem menuItem) {
        menuItem.setVisible(true);
    }

    @Override // defpackage.fry
    public final /* synthetic */ void k() {
    }

    @Override // defpackage.fry
    public final boolean l() {
        return true;
    }

    @Override // defpackage.fry
    public final boolean m() {
        aopa createBuilder = aphw.a.createBuilder();
        String num = Integer.toString(10013);
        createBuilder.copyOnWrite();
        aphw aphwVar = (aphw) createBuilder.instance;
        num.getClass();
        aphwVar.b |= 8;
        aphwVar.e = num;
        aopc aopcVar = (aopc) apzg.a.createBuilder();
        aopcVar.e(ApplicationSettingsEndpointOuterClass.applicationSettingsEndpoint, (aphw) createBuilder.mo39build());
        this.a.c((apzg) aopcVar.mo39build(), null);
        return true;
    }
}
