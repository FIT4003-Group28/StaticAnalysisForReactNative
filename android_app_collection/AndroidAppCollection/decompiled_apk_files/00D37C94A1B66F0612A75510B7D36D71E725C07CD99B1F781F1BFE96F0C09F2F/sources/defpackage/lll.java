package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.google.android.apps.youtube.app.settings.presenter.TimeRangeView;
import com.google.android.youtube.R;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: lll  reason: default package */
/* loaded from: classes3.dex */
public final class lll {
    public int a;
    public final TextView b;
    public final Set c;
    private final TextView d;

    public lll(final Context context, ViewStub viewStub, final aurt aurtVar) {
        final List e = llm.e(aurtVar);
        View inflate = viewStub.inflate();
        this.b = (TextView) inflate.findViewById(R.id.detail_message);
        this.d = (TextView) inflate.findViewById(R.id.title);
        this.c = new HashSet();
        if (e.isEmpty()) {
            return;
        }
        this.a = llm.a(e);
        a(context, aurtVar);
        inflate.setOnClickListener(new View.OnClickListener() { // from class: llk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final lll lllVar = lll.this;
                Context context2 = context;
                aurt aurtVar2 = aurtVar;
                List list = e;
                AlertDialog.Builder builder = new AlertDialog.Builder(context2);
                builder.setCustomTitle(llm.b(context2, aurtVar2));
                final llf llfVar = new llf(context2);
                llfVar.c(llm.f(context2, list));
                llfVar.b(llm.c(context2, list, lllVar.a));
                builder.setPositiveButton(R.string.done, new DialogInterface.OnClickListener() { // from class: llj
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        lll lllVar2 = lll.this;
                        llf llfVar2 = llfVar;
                        lllVar2.b.setText((String) llfVar2.b.get(llfVar2.a.getValue()));
                        int a = llfVar2.a();
                        lllVar2.a = a;
                        for (lli lliVar : lllVar2.c) {
                            TimeRangeView timeRangeView = lliVar.a;
                            int i2 = lliVar.b;
                            timeRangeView.g = llm.i(timeRangeView.g, 0, a);
                            timeRangeView.g = llm.i(timeRangeView.g, 1, i2 + a);
                            timeRangeView.f = llm.g(timeRangeView.g);
                            if (timeRangeView.f.size() == timeRangeView.d) {
                                timeRangeView.e = 1;
                                lll lllVar3 = timeRangeView.b;
                                if (lllVar3 != null) {
                                    lllVar3.a(timeRangeView.a, (aurt) timeRangeView.f.get(0));
                                }
                                lll lllVar4 = timeRangeView.c;
                                if (lllVar4 != null) {
                                    lllVar4.a(timeRangeView.a, (aurt) timeRangeView.f.get(1));
                                }
                            }
                        }
                        dialogInterface.dismiss();
                    }
                });
                builder.setNegativeButton(R.string.cancel, gzj.g);
                builder.setView(llfVar);
                builder.create().show();
            }
        });
    }

    public final void a(Context context, aurt aurtVar) {
        List e = llm.e(aurtVar);
        if (e.isEmpty()) {
            return;
        }
        this.a = llm.a(e);
        TextView textView = this.d;
        arag aragVar = aurtVar.d;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        textView.setText(ajgl.b(aragVar));
        this.b.setText(llm.c(context, e, this.a));
    }
}
