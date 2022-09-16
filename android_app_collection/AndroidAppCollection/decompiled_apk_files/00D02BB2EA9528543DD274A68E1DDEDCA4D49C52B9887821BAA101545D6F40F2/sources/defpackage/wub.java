package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: wub  reason: default package */
/* loaded from: classes7.dex */
public class wub implements zdl {
    public final gen a;
    private final Activity b;
    private final List<zdj> c;
    @dzsi
    private final CharSequence d;

    public wub(Activity activity, gen genVar, drgz drgzVar, @dzsi CharSequence charSequence) {
        this.b = activity;
        this.a = genVar;
        this.d = charSequence;
        ArrayList arrayList = new ArrayList();
        for (drgy drgyVar : drgzVar.a) {
            final ArrayList arrayList2 = new ArrayList();
            for (doxp doxpVar : drgyVar.a) {
                arrayList2.add(new wua(doxpVar));
            }
            arrayList.add(new zdj(arrayList2) { // from class: wtz
                private final List a;

                {
                    this.a = arrayList2;
                }

                @Override // defpackage.zdj
                public List a() {
                    return this.a;
                }
            });
        }
        this.c = arrayList;
    }

    @Override // defpackage.zdl
    public CharSequence a() {
        return this.b.getString(R.string.FARE_BREAKDOWN_TITLE);
    }

    @Override // defpackage.zdl
    public CharSequence b() {
        return this.b.getString(R.string.OK_BUTTON);
    }

    @Override // defpackage.zdl
    @dzsi
    public CharSequence c() {
        return this.d;
    }

    @Override // defpackage.zdl
    public List<zdj> d() {
        return this.c;
    }

    @Override // defpackage.zdl
    public View.OnClickListener e() {
        return new View.OnClickListener(this) { // from class: wty
            private final wub a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.a.aT();
            }
        };
    }
}
