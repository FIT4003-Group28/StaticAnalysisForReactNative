package defpackage;

import android.view.MenuItem;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: lvv  reason: default package */
/* loaded from: classes3.dex */
public final class lvv implements fry {
    private final avtn a;
    private final aafo b;
    private final /* synthetic */ int c;

    public lvv(avtn avtnVar, aafo aafoVar, int i) {
        this.c = i;
        aqxo.y((avtnVar.b & 2) != 0);
        this.a = avtnVar;
        this.b = aafoVar;
    }

    @Override // defpackage.fry
    public final int g() {
        return this.c != 0 ? R.id.menu_creation : R.id.menu_upload;
    }

    @Override // defpackage.fry
    public final int h() {
        return this.c != 0 ? R.menu.creation_menu : R.menu.upload_menu;
    }

    @Override // defpackage.fry
    public final frx i() {
        return null;
    }

    @Override // defpackage.fry
    public final void j(MenuItem menuItem) {
    }

    @Override // defpackage.fry
    public final /* synthetic */ void k() {
    }

    @Override // defpackage.fry
    public final boolean l() {
        return true;
    }

    public lvv(avtn avtnVar, aafo aafoVar) {
        aqxo.y((avtnVar.b & 2) != 0);
        this.a = avtnVar;
        this.b = aafoVar;
    }

    @Override // defpackage.fry
    public final boolean m() {
        if (this.c == 0) {
            aafo aafoVar = this.b;
            apzg apzgVar = this.a.c;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.c(apzgVar, null);
            return true;
        }
        aafo aafoVar2 = this.b;
        apzg apzgVar2 = this.a.c;
        if (apzgVar2 == null) {
            apzgVar2 = apzg.a;
        }
        aafoVar2.c(apzgVar2, null);
        return true;
    }
}
