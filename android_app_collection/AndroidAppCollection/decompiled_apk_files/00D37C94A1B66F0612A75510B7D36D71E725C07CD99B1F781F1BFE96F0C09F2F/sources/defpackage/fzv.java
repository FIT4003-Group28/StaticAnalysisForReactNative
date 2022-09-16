package defpackage;

import android.view.View;
import com.google.android.youtube.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fzv  reason: default package */
/* loaded from: classes3.dex */
public class fzv {
    public static final int[] a = {R.string.accessibility_like_video, R.string.accessibility_undo_like_video, R.plurals.accessibility_like_video_plural, R.plurals.accessibility_undo_like_video_plural};
    public static final int[] b = {R.string.accessibility_dislike_video, R.string.accessibility_undo_dislike_video, R.plurals.accessibility_dislike_video_plural, R.plurals.accessibility_undo_dislike_video_plural};
    protected final boolean c;
    protected final View d;

    public fzv(View view, boolean z) {
        this.d = view;
        this.c = z;
    }

    public final void a(CharSequence charSequence) {
        this.d.setContentDescription(charSequence);
    }

    public void b(boolean z) {
        this.d.setEnabled(z);
        this.d.setAlpha(true != z ? 0.2f : 1.0f);
    }

    public final void c(int i) {
        this.d.setVisibility(i);
    }

    public final boolean d(aspb aspbVar) {
        return (!this.c && aspbVar == aspb.LIKE) || (this.c && aspbVar == aspb.DISLIKE);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e(aspb aspbVar, aopc aopcVar) {
        if (aopcVar != null) {
            if (!aopcVar.qn(asou.b) || !((Boolean) aopcVar.qm(asou.b)).booleanValue()) {
                aopcVar.e(asou.b, true);
            }
            aopcVar.e(asou.c, aspbVar);
        }
        aspb aspbVar2 = aspb.LIKE;
        int ordinal = aspbVar.ordinal();
        if (ordinal == 0) {
            this.d.setSelected(!this.c);
        } else if (ordinal == 1) {
            this.d.setSelected(this.c);
        } else {
            this.d.setSelected(false);
        }
    }
}
