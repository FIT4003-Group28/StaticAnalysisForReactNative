package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import com.google.android.youtube.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: acix  reason: default package */
/* loaded from: classes.dex */
public final class acix {
    public final abzb a;
    public final EditText b;
    public final RecyclerView c;
    public final View d;
    public final aciw e;
    public final Executor f;
    public String g;
    private final acis h;

    public acix(abzb abzbVar, Executor executor, View view, acis acisVar) {
        this.a = abzbVar;
        EditText editText = (EditText) view.findViewById(R.id.input_text);
        this.b = editText;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.game_title_results);
        this.c = recyclerView;
        this.f = executor;
        this.h = acisVar;
        view.findViewById(R.id.back_button).setOnClickListener(new acip(this, 1));
        View findViewById = view.findViewById(R.id.reset_input_button);
        this.d = findViewById;
        findViewById.setOnClickListener(new acip(this));
        editText.addTextChangedListener(new acit(this));
        recyclerView.getContext();
        recyclerView.ag(new LinearLayoutManager());
        aciw aciwVar = new aciw(new aciq(this));
        this.e = aciwVar;
        recyclerView.ad(aciwVar);
    }

    public final void a(arbt arbtVar) {
        zag.i(this.b);
        ((ackv) this.h).a.aE(arbtVar);
    }
}
