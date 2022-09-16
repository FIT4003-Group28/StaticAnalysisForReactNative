package defpackage;

import android.view.MenuItem;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ijb  reason: default package */
/* loaded from: classes3.dex */
public final class ijb implements fry {
    final /* synthetic */ ijc a;
    private MenuItem b;
    private akbm c;

    public ijb(ijc ijcVar) {
        this.a = ijcVar;
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
        this.c = this.a.d.a((YouTubeTextView) menuItem.getActionView().findViewById(R.id.upload_menu_button));
        menuItem.getActionView().findViewById(R.id.upload_menu_button_wrapper).setOnClickListener(new ija());
        MenuItem menuItem2 = this.b;
        if (menuItem2 != null) {
            menuItem2.setEnabled(false);
            YouTubeTextView youTubeTextView = (YouTubeTextView) this.b.getActionView().findViewById(R.id.upload_menu_button);
            akbm akbmVar = this.c;
            aopc aopcVar = (aopc) apoj.a.createBuilder();
            aopcVar.copyOnWrite();
            apoj apojVar = (apoj) aopcVar.instance;
            apojVar.d = 2;
            apojVar.c = 1;
            aopcVar.copyOnWrite();
            apoj apojVar2 = (apoj) aopcVar.instance;
            apojVar2.b |= 64;
            apojVar2.h = true;
            arag aragVar = null;
            akbmVar.b((apoj) aopcVar.mo39build(), null);
            atat atatVar = this.a.b;
            if ((atatVar.b & 2) != 0 && (aragVar = atatVar.c) == null) {
                aragVar = arag.a;
            }
            youTubeTextView.setText(ajgl.b(aragVar));
            youTubeTextView.setOnClickListener(new ija(2));
            youTubeTextView.setEnabled(false);
        }
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
