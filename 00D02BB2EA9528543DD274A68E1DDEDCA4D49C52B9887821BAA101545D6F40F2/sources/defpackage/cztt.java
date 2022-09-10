package defpackage;

import android.content.Context;
import android.os.Trace;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cztt  reason: default package */
/* loaded from: classes5.dex */
public final class cztt {
    public static final dcdc<czuc> a = dcdc.e();
    private static final SparseArray<View> l = new SparseArray<>();
    private static final int[] p = {R.id.toastbar_button1, R.id.toastbar_button2, R.id.toastbar_button3};
    public View b;
    public View c;
    public String d;
    public cztr e;
    public List<czuc> f;
    public czua g;
    public int h;
    public final boolean i;
    @dzsi
    public TextView j;
    public List<cztx> k;
    private final cztz m;
    private final Context n;
    private dcdc<Button> o;

    public cztt(cztq cztqVar) {
        if (czuj.a) {
            Trace.beginSection("Toast");
        }
        this.m = cztqVar.a;
        Context context = cztqVar.b;
        this.n = context;
        this.k = new ArrayList();
        this.i = false;
        int size = cztqVar.d.size();
        SparseArray<View> sparseArray = l;
        View view = sparseArray.get(size);
        if (view == null) {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
            if (size == 0 || size == 1) {
                view = layoutInflater.inflate(R.layout.toastbar_one_button, (ViewGroup) null);
                sparseArray.put(0, this.b);
                sparseArray.put(1, this.b);
            } else if (size == 2) {
                view = layoutInflater.inflate(R.layout.toastbar_two_button, (ViewGroup) null);
                sparseArray.put(2, this.b);
            } else if (size == 3) {
                view = layoutInflater.inflate(R.layout.toastbar_three_button, (ViewGroup) null);
                sparseArray.put(3, this.b);
            } else {
                StringBuilder sb = new StringBuilder(49);
                sb.append("Can only support up to 3 buttons, not ");
                sb.append(size);
                throw new IndexOutOfBoundsException(sb.toString());
            }
        }
        dbsk.s(view);
        this.b = view;
        View findViewById = view.findViewById(R.id.toastbar);
        this.c = findViewById;
        if (size == 0) {
            findViewById.setMinimumWidth(0);
        } else {
            findViewById.setMinimumWidth(context.getResources().getDimensionPixelOffset(R.dimen.toastbar_minimum_width));
        }
        dccx F = dcdc.F();
        int[] iArr = p;
        int length = iArr.length;
        for (int i = 0; i < 3; i++) {
            Button button = (Button) this.b.findViewById(iArr[i]);
            if (button != null) {
                F.g(button);
            }
        }
        dcdc<Button> f = F.f();
        this.o = f;
        f.get(0).setVisibility(size > 0 ? 0 : 8);
        this.j = (TextView) this.b.findViewById(R.id.toastbar_message);
        View view2 = this.b;
        if (view2 != null) {
            view2.setImportantForAccessibility(2);
        }
        TextView textView = this.j;
        if (textView != null) {
            textView.setImportantForAccessibility(0);
            this.j.setLongClickable(false);
        }
        dcdc<Button> dcdcVar = this.o;
        int size2 = dcdcVar.size();
        for (int i2 = 0; i2 < size2; i2++) {
            dcdcVar.get(i2).setImportantForAccessibility(0);
        }
        if (size <= this.o.size()) {
            for (int i3 = 0; i3 < size; i3++) {
                Button button2 = this.o.get(i3);
                czts cztsVar = cztqVar.d.get(i3);
                button2.setText(cztsVar.a);
                int i4 = cztsVar.b;
                button2.setOnClickListener(new cztp(this, cztsVar));
            }
            String str = cztqVar.c;
            if (str == null) {
                this.j.setVisibility(8);
            } else {
                this.j.setText(str);
            }
            if (czuj.a) {
                Trace.endSection();
            }
            this.d = cztqVar.c;
            this.e = cztqVar.e;
            this.f = cztqVar.f;
            this.g = cztqVar.g;
            this.h = 80;
            return;
        }
        throw new IndexOutOfBoundsException(String.format("Can only support up to %d: %d", Integer.valueOf(this.o.size()), Integer.valueOf(size)));
    }

    public static cztq a(cztz cztzVar) {
        return new cztq(cztzVar);
    }

    public final void b() {
        this.m.a(this);
    }

    public final void c(boolean z) {
        dcdc<Button> dcdcVar = this.o;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            dcdcVar.get(i).setClickable(z);
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        TextView textView = this.j;
        if (textView != null) {
            arrayList.add(textView.getText());
        }
        dcdc<Button> dcdcVar = this.o;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(dcdcVar.get(i).getText());
        }
        return TextUtils.join("\n", arrayList);
    }
}
