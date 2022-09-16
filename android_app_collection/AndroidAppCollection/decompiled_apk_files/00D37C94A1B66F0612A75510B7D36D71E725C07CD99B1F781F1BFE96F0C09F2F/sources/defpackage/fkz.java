package defpackage;

import com.google.android.apps.youtube.app.common.rendering.presenter.donationshelf.PrefixedEditText;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: fkz  reason: default package */
/* loaded from: classes3.dex */
public final class fkz {
    public final YouTubeTextView a;
    public final TextInputLayout b;
    public final PrefixedEditText c;
    public final fky d = new fky(this);
    public aqnb e;
    public nlm f;

    public fkz(YouTubeTextView youTubeTextView, TextInputLayout textInputLayout) {
        this.a = youTubeTextView;
        this.b = textInputLayout;
        this.c = (PrefixedEditText) textInputLayout.findViewById(R.id.custom_amount_edit);
    }
}
