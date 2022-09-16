package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: akaz  reason: default package */
/* loaded from: classes.dex */
public final class akaz extends vev {
    private final ajql a;
    private ajqm b;

    public akaz(Context context, ajqm ajqmVar) {
        super(context);
        akax akaxVar = new akax(this);
        this.a = akaxVar;
        this.b = ajqr.a;
        ajqmVar.getClass();
        this.b.pl(akaxVar);
        this.b = ajqmVar;
        ajqmVar.lT(akaxVar);
        notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.vev
    public final Object a(int i, View view) {
        if (getItem(i) instanceof akba) {
            if (i == 0) {
                view.setLayoutDirection(getContext().getResources().getConfiguration().getLayoutDirection());
            }
            return new akay(view);
        }
        return super.a(i, view);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.vev
    public final void b(int i, Object obj) {
        ColorStateList f;
        vex item = getItem(i);
        if (item instanceof akba) {
            akba akbaVar = (akba) item;
            akay akayVar = (akay) obj;
            akayVar.a.setText(akbaVar.c);
            TextView textView = akayVar.a;
            boolean z = akbaVar.b;
            int i2 = R.attr.ytTextDisabled;
            int i3 = R.attr.ytTextPrimary;
            if (z) {
                f = akbaVar.d;
                if (f == null) {
                    f = zhn.f(textView.getContext(), R.attr.ytTextPrimary);
                }
            } else {
                f = zhn.f(textView.getContext(), R.attr.ytTextDisabled);
            }
            textView.setTextColor(f);
            Drawable drawable = akbaVar.e;
            if (drawable != null) {
                akayVar.b.setImageDrawable(drawable);
                akayVar.b.setVisibility(0);
                ImageView imageView = akayVar.b;
                imageView.setImageTintList(zhn.f(imageView.getContext(), true != akbaVar.b ? R.attr.ytIconDisabled : R.attr.ytTextPrimary));
            } else {
                akayVar.b.setVisibility(8);
            }
            String str = akbaVar.h;
            if (str != null) {
                akayVar.c.setText(str);
                akayVar.c.setVisibility(0);
                akayVar.d.setText("•");
                akayVar.d.setVisibility(0);
                Context context = akayVar.c.getContext();
                if (true == akbaVar.b) {
                    i2 = R.attr.ytTextSecondary;
                }
                ColorStateList f2 = zhn.f(context, i2);
                akayVar.c.setTextColor(f2);
                akayVar.d.setTextColor(f2);
            } else {
                akayVar.c.setVisibility(8);
                akayVar.d.setVisibility(8);
            }
            Drawable drawable2 = akbaVar.f;
            if (drawable2 != null) {
                akayVar.e.setImageDrawable(drawable2);
                akayVar.e.setVisibility(0);
                ImageView imageView2 = akayVar.e;
                Context context2 = imageView2.getContext();
                if (true != akbaVar.b) {
                    i3 = R.attr.ytIconDisabled;
                }
                imageView2.setImageTintList(zhn.f(context2, i3));
            } else {
                akayVar.e.setVisibility(8);
            }
            akayVar.f.setBackgroundColor(akbaVar.i);
            return;
        }
        super.b(i, obj);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    /* renamed from: c */
    public final vex getItem(int i) {
        return (vex) this.b.c(i);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final int getCount() {
        return this.b.a();
    }
}
