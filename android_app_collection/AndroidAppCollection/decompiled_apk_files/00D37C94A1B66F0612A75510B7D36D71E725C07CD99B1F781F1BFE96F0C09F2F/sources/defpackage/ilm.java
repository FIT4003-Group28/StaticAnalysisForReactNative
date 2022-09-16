package defpackage;

import android.view.MenuItem;
import android.view.View;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ilm  reason: default package */
/* loaded from: classes3.dex */
public final class ilm extends ilk implements fry {
    MenuItem a;
    final /* synthetic */ iln b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ilm(iln ilnVar) {
        super(ilnVar);
        this.b = ilnVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ilk
    public final void a(boolean z) {
        MenuItem menuItem = this.a;
        if (menuItem != null) {
            menuItem.setVisible(z);
        }
    }

    @Override // defpackage.fry
    public final int g() {
        return R.id.menu_upload_activity_done;
    }

    @Override // defpackage.fry
    public final int h() {
        return R.menu.upload_menu_send;
    }

    @Override // defpackage.fry
    public final frx i() {
        return null;
    }

    @Override // defpackage.fry
    public final void j(MenuItem menuItem) {
        this.a = menuItem;
        this.c = (YouTubeTextView) menuItem.getActionView().findViewById(R.id.upload_menu_button);
        this.d = this.b.a.a(this.c);
        View findViewById = this.a.getActionView().findViewById(R.id.upload_menu_button_wrapper);
        findViewById.setFilterTouchesWhenObscured(true);
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: ill
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ilm.this.b.a();
            }
        });
        this.b.c();
    }

    @Override // defpackage.fry
    public final /* synthetic */ void k() {
    }

    @Override // defpackage.fry
    public final boolean l() {
        return false;
    }

    @Override // defpackage.fry
    public final boolean m() {
        return true;
    }
}
