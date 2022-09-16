package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import com.google.android.libraries.messaging.lighter.ui.avatar.ContactAvatarView;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cvge  reason: default package */
/* loaded from: classes5.dex */
public final class cvge extends LinearLayout implements cvfz {
    public final TextView a;
    Animatable b;
    azu c;
    private final List<cufj> d;
    private int e;
    private final RelativeLayout f;
    private final LinearLayout g;

    public cvge(Context context) {
        this(context, null);
    }

    private final void b() {
        this.b.stop();
        Drawable drawable = (Drawable) this.b;
        azu azuVar = this.c;
        if (drawable != null && azuVar != null && (drawable instanceof Animatable)) {
            if (Build.VERSION.SDK_INT >= 24) {
                azz.d((AnimatedVectorDrawable) drawable, azuVar);
            } else {
                ((azz) drawable).c(azuVar);
            }
        }
        this.b.start();
    }

    @Override // defpackage.cvfz
    public final void a(List<cufj> list) {
        Animator.AnimatorListener animatorListener;
        if (list.size() > this.e) {
            this.a.setVisibility(0);
            this.g.setVisibility(8);
            b();
        } else if (list.isEmpty()) {
            Drawable drawable = (Drawable) this.b;
            azu azuVar = this.c;
            if (drawable == null || azuVar == null || !(drawable instanceof Animatable)) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 24) {
                azz.e((AnimatedVectorDrawable) drawable, azuVar);
                return;
            }
            azz azzVar = (azz) drawable;
            Drawable drawable2 = azzVar.e;
            if (drawable2 != null) {
                azz.e((AnimatedVectorDrawable) drawable2, azuVar);
            }
            ArrayList<azu> arrayList = azzVar.c;
            if (arrayList == null) {
                return;
            }
            arrayList.remove(azuVar);
            if (azzVar.c.size() != 0 || (animatorListener = azzVar.b) == null) {
                return;
            }
            azzVar.a.c.removeListener(animatorListener);
            azzVar.b = null;
            return;
        } else {
            this.g.setVisibility(0);
            this.a.setVisibility(8);
            b();
        }
        int size = this.d.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (!list.contains(this.d.get(size)) && this.d.get(size) != null) {
                this.d.remove(size);
                this.g.removeViewAt(size);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            cufj cufjVar = list.get(i);
            if (!this.d.contains(cufjVar)) {
                this.d.add(cufjVar);
                ContactAvatarView contactAvatarView = new ContactAvatarView(getContext());
                contactAvatarView.a(cufjVar);
                contactAvatarView.setAvatarSize((int) getContext().getResources().getDimension(R.dimen.avatar_size));
                contactAvatarView.setImportantForAccessibility(2);
                contactAvatarView.setFocusable(false);
                contactAvatarView.setPadding(0, 0, (int) getContext().getResources().getDimension(R.dimen.avatar_padding), 0);
                this.g.addView(contactAvatarView);
            }
        }
        if (list.size() != 1 || !list.get(0).b().a()) {
            this.f.setContentDescription(getContext().getString(R.string.group_typing_message, Integer.valueOf(list.size())));
        } else {
            this.f.setContentDescription(getContext().getString(R.string.user_typing_message, list.get(0).b().b()));
        }
    }

    @Override // defpackage.cvfz
    public void setMaxAvatars(int i) {
        this.e = i;
    }

    /* renamed from: setPresenter  reason: avoid collision after fix types in other method */
    public void setPresenter2(cvfy cvfyVar) {
    }

    @Override // defpackage.cuvv
    public /* bridge */ /* synthetic */ void setPresenter(cvfy cvfyVar) {
    }

    public cvge(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public cvge(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new ArrayList(5);
        this.e = 5;
        inflate(getContext(), R.layout.typing_indicator_view, this);
        this.g = (LinearLayout) findViewById(R.id.typers);
        this.b = (Animatable) ((ImageView) findViewById(R.id.typing_dots)).getDrawable();
        this.f = (RelativeLayout) findViewById(R.id.typing_indicator_contents);
        TextView textView = (TextView) findViewById(R.id.additional_typers);
        this.a = textView;
        textView.setVisibility(8);
        this.c = new cvgd(this);
    }
}
