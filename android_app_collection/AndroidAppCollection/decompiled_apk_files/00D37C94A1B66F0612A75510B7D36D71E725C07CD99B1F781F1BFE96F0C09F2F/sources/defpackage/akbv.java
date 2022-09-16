package defpackage;

import android.content.Context;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: akbv  reason: default package */
/* loaded from: classes.dex */
public class akbv {
    public final Context a;
    public final ajyi b;
    public final ajvj c;
    public final ajvi d;
    public final SpannableStringBuilder e;
    public akcd f;
    public EditText g;
    public boolean h;
    public View i;
    public boolean j;
    private final ajry k;
    private final ajvp l;
    private TextWatcher m;

    public akbv(Context context, ajyi ajyiVar, ajvj ajvjVar, ajxz ajxzVar, ajvm ajvmVar, ajry ajryVar) {
        this.a = context;
        ajvjVar.getClass();
        this.c = ajvjVar;
        ajyiVar.getClass();
        this.b = ajyiVar;
        ajyiVar.a(akcd.class);
        this.k = ajryVar;
        akbt akbtVar = new akbt(this);
        this.l = akbtVar;
        this.d = new ajvi(context, ajxzVar, ajvmVar, true, akbtVar, true);
        this.e = new SpannableStringBuilder();
    }

    private static final int a(int i, int i2) {
        if (i < i2) {
            return i2 - i;
        }
        return 0;
    }

    public final int b(CharSequence charSequence, int i) {
        int a;
        int a2;
        String trim = charSequence.toString().trim();
        if (TextUtils.isEmpty(trim) || !this.c.h() || i <= 0) {
            return trim.length();
        }
        Matcher matcher = this.c.f().matcher(trim);
        int length = trim.length();
        boolean z = false;
        int i2 = 0;
        int i3 = 0;
        while (matcher.find()) {
            if (matcher.start() > i2) {
                if (!z) {
                    a2 = a(i2, matcher.start());
                } else {
                    a2 = a(length, matcher.start());
                }
                a = i3 + a2;
                i2 = matcher.start();
            } else {
                a = i3 + a(i2, matcher.start());
            }
            i3 = a + i;
            length = matcher.end();
            z = true;
        }
        if (!z) {
            return trim.length();
        }
        return length < trim.length() ? i3 + a(length, trim.length()) : i3;
    }

    public final TextWatcher c(EditText editText) {
        this.g = editText;
        if (this.m == null) {
            this.m = new akbu(this, this);
        }
        return this.m;
    }

    public final void d() {
        View view = this.i;
        if (view != null) {
            view.setVisibility(8);
        }
        this.h = false;
    }

    public final void e(Editable editable) {
        Pattern f = this.c.f();
        if (f == null || TextUtils.isEmpty(editable.toString())) {
            return;
        }
        Matcher matcher = f.matcher(editable.toString());
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            if (((ImageSpan[]) editable.getSpans(matcher.start(), matcher.end(), ImageSpan.class)).length == 0) {
                if (arrayList.contains(Integer.valueOf(matcher.start()))) {
                    return;
                }
                arrayList.add(Integer.valueOf(matcher.start()));
                String d = this.c.d(matcher.group());
                this.e.clear();
                this.d.e();
                this.d.a(this.c.e(d), this.c.b(d), this.a.getResources().getDimension(R.dimen.emoji_height), d, this.g.getId(), this.e, null);
            }
        }
    }

    public final void f(ViewGroup viewGroup, aqus aqusVar, EditText editText, final akcc akccVar) {
        this.g = editText;
        editText.setOnTouchListener(new View.OnTouchListener() { // from class: akbs
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                akbv akbvVar = akbv.this;
                akcc akccVar2 = akccVar;
                if (!akbvVar.h || akccVar2 == null) {
                    return false;
                }
                akccVar2.nb();
                return false;
            }
        });
        if (aqusVar != null) {
            akcd akcdVar = (akcd) this.k.b(viewGroup);
            this.f = akcdVar;
            akcdVar.e = editText;
            akcdVar.d = akccVar;
            this.i = akcdVar.b;
            ajrs ajrsVar = new ajrs();
            ajrsVar.f("VIEW_POOL_KEY", this.b.get());
            ajrsVar.f("CONTROLLER_KEY", this);
            this.f.oK(ajrsVar, aqusVar);
            zag.i(this.i);
            this.i.setVisibility(0);
            this.h = true;
            return;
        }
        d();
    }
}
