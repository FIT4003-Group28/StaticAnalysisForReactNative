package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import java.util.Calendar;
import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: czyq  reason: default package */
/* loaded from: classes5.dex */
public final class czyq extends abg<czyp> {
    public final czxs<?> a;

    public czyq(czxs<?> czxsVar) {
        this.a = czxsVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a(int i) {
        return i - this.a.b.a.c;
    }

    @Override // defpackage.abg
    public final int c() {
        return this.a.b.e;
    }

    @Override // defpackage.abg
    public final /* bridge */ /* synthetic */ czyp d(ViewGroup viewGroup, int i) {
        return new czyp((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }

    @Override // defpackage.abg
    public final /* bridge */ /* synthetic */ void e(czyp czypVar, int i) {
        czyp czypVar2 = czypVar;
        int i2 = this.a.b.a.c + i;
        String string = czypVar2.s.getContext().getString(R.string.mtrl_picker_navigate_to_year_description);
        TextView textView = czypVar2.s;
        Locale locale = Locale.getDefault();
        Integer valueOf = Integer.valueOf(i2);
        textView.setText(String.format(locale, "%d", valueOf));
        czypVar2.s.setContentDescription(String.format(string, valueOf));
        czxf czxfVar = this.a.d;
        Calendar a = czyn.a();
        czxe czxeVar = a.get(1) == i2 ? czxfVar.f : czxfVar.d;
        for (Long l : this.a.a.c()) {
            a.setTimeInMillis(l.longValue());
            if (a.get(1) == i2) {
                czxeVar = czxfVar.e;
            }
        }
        czxeVar.b(czypVar2.s);
        czypVar2.s.setOnClickListener(new czyo(this, i2));
    }
}
