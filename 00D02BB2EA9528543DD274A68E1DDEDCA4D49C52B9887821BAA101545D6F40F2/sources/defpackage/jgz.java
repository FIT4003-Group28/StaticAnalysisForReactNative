package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: jgz  reason: default package */
/* loaded from: classes.dex */
public class jgz extends ImageButton {
    public isd a;
    public cjqy b;
    @dzsi
    public jhs c;
    @dzsi
    public isc d;
    @dzsi
    public jhr e;
    @dzsi
    private List<jho> f;

    /* JADX INFO: Access modifiers changed from: protected */
    public jgz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ((jha) bttc.a(jha.class, this)).wy(this);
        setImageResource(2131231593);
        setColorFilter(context.getResources().getColor(R.color.qu_daynight_grey_600));
        setBackgroundResource(0);
        setContentDescription(context.getString(R.string.ACCESSIBILITY_OVERFLOW_MENU));
        setOnClickListener(new View.OnClickListener(this) { // from class: jgx
            private final jgz a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jgz jgzVar = this.a;
                cjql e = cjqg.e(view);
                cjtd k = cjqg.k(view);
                if (e != null && k != null) {
                    jgzVar.b.n(e, new cjte(deaf.TAP), k);
                }
                jhs jhsVar = jgzVar.c;
                if (jhsVar != null) {
                    jhsVar.a();
                }
                isc a = jgzVar.a.a(view);
                jgzVar.a(a);
                jgzVar.d = a;
                jgzVar.d.show();
            }
        });
    }

    public final void a(isc iscVar) {
        List<jho> list = this.f;
        if (list != null) {
            iscVar.a(list);
        }
        if (this.e != null) {
            iscVar.c = new PopupMenu.OnMenuItemClickListener(this) { // from class: jgy
                private final jgz a;

                {
                    this.a = this;
                }

                @Override // android.widget.PopupMenu.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    this.a.e.a(menuItem.getItemId());
                    return true;
                }
            };
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        isc iscVar = this.d;
        if (iscVar != null) {
            iscVar.dismiss();
        }
    }

    public final void setProperties(@dzsi jht jhtVar) {
        if (jhtVar == null || jhtVar.b().isEmpty()) {
            setVisibility(8);
            return;
        }
        if (jhtVar.e() != null) {
            setImageResource(jhtVar.e().intValue());
        }
        if (jhtVar.f() != null) {
            setColorFilter(jhtVar.f().intValue());
        }
        if (!dbsj.d(jhtVar.g())) {
            setContentDescription(jhtVar.g());
        } else {
            setContentDescription(getContext().getString(R.string.ACCESSIBILITY_OVERFLOW_MENU));
        }
        this.f = jhtVar.b();
        this.e = jhtVar.d();
        this.c = jhtVar.c();
        setVisibility(0);
        isc iscVar = this.d;
        if (iscVar == null) {
            return;
        }
        a(iscVar);
    }
}
