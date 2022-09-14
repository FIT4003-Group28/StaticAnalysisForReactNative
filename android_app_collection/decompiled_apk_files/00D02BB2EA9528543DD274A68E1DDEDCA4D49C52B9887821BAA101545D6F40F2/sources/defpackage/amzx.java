package defpackage;

import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: amzx  reason: default package */
/* loaded from: classes2.dex */
public final class amzx {
    public final Resources a;
    @dzsi
    public TextView b;
    private final StringBuilder c = new StringBuilder();

    public amzx(Resources resources) {
        this.a = resources;
    }

    public final void a(final TextView textView, final String str, final int i, final int i2) {
        textView.post(new Runnable(this, i, i2, textView, str) { // from class: amzw
            private final amzx a;
            private final int b;
            private final int c;
            private final TextView d;
            private final String e;

            {
                this.a = this;
                this.b = i;
                this.c = i2;
                this.d = textView;
                this.e = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                amzx amzxVar = this.a;
                int i3 = this.b;
                int i4 = this.c;
                TextView textView2 = this.d;
                String str2 = this.e;
                int color = amzxVar.a.getColor(i3);
                int color2 = amzxVar.a.getColor(i4);
                float f = amzxVar.a.getDisplayMetrics().density;
                textView2.setTextColor(color);
                amzy amzyVar = new amzy(color2, f, textView2.getPaint());
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
                spannableStringBuilder.setSpan(amzyVar, 0, str2.length(), 33);
                textView2.setText(spannableStringBuilder);
            }
        });
    }

    public final String b(HashSet<String> hashSet) {
        if (hashSet.isEmpty()) {
            return "";
        }
        if (this.c.length() > 0) {
            StringBuilder sb = this.c;
            sb.delete(0, sb.length());
        }
        Iterator<String> it = hashSet.iterator();
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                this.c.append(", ");
            }
            this.c.append(it.next());
            z = false;
        }
        return this.c.toString();
    }
}
