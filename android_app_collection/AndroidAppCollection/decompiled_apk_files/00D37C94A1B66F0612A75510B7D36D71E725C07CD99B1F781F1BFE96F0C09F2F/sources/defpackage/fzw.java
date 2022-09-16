package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: fzw  reason: default package */
/* loaded from: classes3.dex */
final class fzw extends fzv {
    public fzw(View view, boolean z) {
        super(view, z);
    }

    @Override // defpackage.fzv
    public final void b(boolean z) {
        Drawable[] compoundDrawables;
        this.d.setEnabled(z);
        for (Drawable drawable : ((TextView) this.d).getCompoundDrawables()) {
            if (drawable != null) {
                drawable.setAlpha(true != z ? 51 : PrivateKeyType.INVALID);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fzv
    public final void e(aspb aspbVar, aopc aopcVar) {
        CharSequence b;
        CharSequence b2;
        CharSequence b3;
        super.e(aspbVar, aopcVar);
        asov asovVar = (asov) aopcVar.mo39build();
        aspb aspbVar2 = aspb.LIKE;
        int ordinal = aspbVar.ordinal();
        arag aragVar = null;
        if (ordinal == 0) {
            TextView textView = (TextView) this.d;
            if (!this.c) {
                aspb b4 = aspb.b(asovVar.d);
                if (b4 == null) {
                    b4 = aspb.LIKE;
                }
                if (b4 != aspb.LIKE) {
                    if ((asovVar.b & 16) != 0 && (aragVar = asovVar.g) == null) {
                        aragVar = arag.a;
                    }
                    b = ajgl.b(aragVar);
                } else {
                    if ((asovVar.b & 8) != 0 && (aragVar = asovVar.f) == null) {
                        aragVar = arag.a;
                    }
                    b = ajgl.b(aragVar);
                }
            } else {
                b = abgb.a(asovVar);
            }
            textView.setText(b);
        } else if (ordinal == 1) {
            TextView textView2 = (TextView) this.d;
            if (this.c) {
                aspb b5 = aspb.b(asovVar.d);
                if (b5 == null) {
                    b5 = aspb.LIKE;
                }
                if (b5 != aspb.DISLIKE) {
                    if ((asovVar.b & 512) != 0 && (aragVar = asovVar.k) == null) {
                        aragVar = arag.a;
                    }
                    b2 = ajgl.b(aragVar);
                } else {
                    if ((asovVar.b & 256) != 0 && (aragVar = asovVar.j) == null) {
                        aragVar = arag.a;
                    }
                    b2 = ajgl.b(aragVar);
                }
            } else {
                b2 = abgb.b(asovVar);
            }
            textView2.setText(b2);
        } else {
            TextView textView3 = (TextView) this.d;
            if (this.c) {
                b3 = abgb.a(asovVar);
            } else {
                b3 = abgb.b(asovVar);
            }
            textView3.setText(b3);
        }
    }
}
