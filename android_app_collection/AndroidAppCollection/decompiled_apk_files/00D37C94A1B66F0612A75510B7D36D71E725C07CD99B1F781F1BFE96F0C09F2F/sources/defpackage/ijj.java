package defpackage;

import android.view.MenuItem;
import com.google.android.apps.youtube.app.extensions.upload.EditVideoActivity;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ijj  reason: default package */
/* loaded from: classes3.dex */
public final class ijj implements fry {
    final /* synthetic */ EditVideoActivity a;
    private MenuItem b;
    private boolean c;
    private akbm d;

    public ijj(EditVideoActivity editVideoActivity) {
        this.a = editVideoActivity;
    }

    private final void c() {
        MenuItem menuItem = this.b;
        if (menuItem != null) {
            menuItem.setEnabled(this.c);
            YouTubeTextView youTubeTextView = (YouTubeTextView) this.b.getActionView().findViewById(R.id.upload_menu_button);
            akbm akbmVar = this.d;
            aopc aopcVar = (aopc) apoj.a.createBuilder();
            aopcVar.copyOnWrite();
            apoj apojVar = (apoj) aopcVar.instance;
            apojVar.d = 2;
            apojVar.c = 1;
            boolean z = this.c;
            aopcVar.copyOnWrite();
            apoj apojVar2 = (apoj) aopcVar.instance;
            apojVar2.b |= 64;
            apojVar2.h = !z;
            akbmVar.b((apoj) aopcVar.mo39build(), null);
            youTubeTextView.setText(R.string.save_metadata_menu);
            youTubeTextView.setFilterTouchesWhenObscured(true);
            youTubeTextView.setOnClickListener(new iji(this));
            youTubeTextView.setEnabled(this.c);
        }
    }

    public final void a() {
        if (!this.c) {
            return;
        }
        EditVideoActivity editVideoActivity = this.a;
        arwq arwqVar = editVideoActivity.t;
        if ((arwqVar.b & 8) == 0) {
            return;
        }
        aafo aafoVar = editVideoActivity.h;
        apzg apzgVar = arwqVar.d;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        aafoVar.c(apzgVar, null);
    }

    public final void b(boolean z) {
        this.c = z;
        c();
    }

    @Override // defpackage.fry
    public final int g() {
        return R.id.menu_save_metadata;
    }

    @Override // defpackage.fry
    public final int h() {
        return R.menu.save_metadata_menu;
    }

    @Override // defpackage.fry
    public final frx i() {
        return null;
    }

    @Override // defpackage.fry
    public final void j(MenuItem menuItem) {
        this.b = menuItem;
        this.d = this.a.n.a((YouTubeTextView) menuItem.getActionView().findViewById(R.id.upload_menu_button));
        this.b.getActionView().findViewById(R.id.upload_menu_button_wrapper).setOnClickListener(new iji(this, 1));
        c();
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
