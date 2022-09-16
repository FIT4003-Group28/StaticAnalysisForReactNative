package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.youtube.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: akcd  reason: default package */
/* loaded from: classes.dex */
public final class akcd implements ajru {
    public final Handler a;
    public final ViewGroup b;
    public final Runnable c = new akca(this);
    public akcc d;
    public EditText e;
    private final Context f;
    private final acti g;
    private final LinearLayout h;
    private final ImageView i;
    private final ImageView j;
    private final ajvj k;
    private ajqi l;

    public akcd(Context context, acti actiVar, Handler handler, ajvj ajvjVar, ViewGroup viewGroup) {
        this.f = context;
        this.g = actiVar;
        this.a = handler;
        this.b = viewGroup;
        this.k = ajvjVar;
        this.h = (LinearLayout) viewGroup.findViewById(R.id.emoji_category_container);
        this.i = (ImageView) viewGroup.findViewById(R.id.keyboard_button);
        this.j = (ImageView) viewGroup.findViewById(R.id.backspace_button);
    }

    private final void e(aquq aquqVar, ajrs ajrsVar) {
        ajqi ajqiVar = this.l;
        this.h.addView(ajqiVar.f(ajqiVar.d(ajrsVar), aquqVar, this.h), new ViewGroup.LayoutParams(-1, -2));
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajru
    /* renamed from: d */
    public final void oK(ajrs ajrsVar, aqus aqusVar) {
        acte acteVar;
        this.h.removeAllViews();
        this.i.setOnClickListener(new View.OnClickListener() { // from class: akby
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                akcc akccVar = akcd.this.d;
                if (akccVar != null) {
                    akccVar.nb();
                }
            }
        });
        this.j.setOnTouchListener(new View.OnTouchListener() { // from class: akbz
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                akcd akcdVar = akcd.this;
                int action = motionEvent.getAction();
                if (action == 0) {
                    akcdVar.a.post(akcdVar.c);
                    return true;
                } else if (action != 1) {
                    return false;
                } else {
                    akcdVar.a.removeCallbacks(akcdVar.c);
                    return true;
                }
            }
        });
        this.l = new akcb(this.f, (ajsa) ajrsVar.c("VIEW_POOL_KEY"));
        ajrsVar.a(this.g);
        int i = aqusVar.b;
        int i2 = i & 4096;
        if (i2 != 0 || (i & 2048) != 0) {
            if (i2 != 0) {
                acteVar = new acte(aqusVar.e.I());
            } else {
                aoux aouxVar = aqusVar.d;
                if (aouxVar == null) {
                    aouxVar = aoux.a;
                }
                acteVar = new acte(actj.a(aouxVar.c));
            }
            this.g.n(acteVar);
        }
        for (aqur aqurVar : aqusVar.c) {
            if (aqurVar.b == 126326585) {
                e((aquq) aqurVar.c, ajrsVar);
            }
            if (aqurVar.b == 171549018) {
                aqut aqutVar = (aqut) aqurVar.c;
                long j = 0;
                for (String str : aqutVar.e) {
                    ajvj ajvjVar = this.k;
                    if (ajvjVar.a.get(str) == null || !((aqup) ajvjVar.a.get(str)).h) {
                        j++;
                    }
                }
                if (j < aqutVar.e.size()) {
                    ajqi ajqiVar = this.l;
                    this.h.addView(ajqiVar.f(ajqiVar.d(ajrsVar), aqutVar, this.h), new ViewGroup.LayoutParams(-1, -2));
                } else {
                    aopa createBuilder = aquq.a.createBuilder();
                    String str2 = aqutVar.c;
                    createBuilder.copyOnWrite();
                    aquq aquqVar = (aquq) createBuilder.instance;
                    str2.getClass();
                    aquqVar.b |= 1;
                    aquqVar.c = str2;
                    arag aragVar = aqutVar.d;
                    if (aragVar == null) {
                        aragVar = arag.a;
                    }
                    createBuilder.copyOnWrite();
                    aquq aquqVar2 = (aquq) createBuilder.instance;
                    aragVar.getClass();
                    aquqVar2.d = aragVar;
                    aquqVar2.b |= 2;
                    aopu aopuVar = aqutVar.e;
                    createBuilder.copyOnWrite();
                    aquq aquqVar3 = (aquq) createBuilder.instance;
                    aopu aopuVar2 = aquqVar3.e;
                    if (!aopuVar2.c()) {
                        aquqVar3.e = aopi.mutableCopy(aopuVar2);
                    }
                    aonk.addAll((Iterable) aopuVar, (List) aquqVar3.e);
                    aoux aouxVar2 = aqutVar.g;
                    if (aouxVar2 == null) {
                        aouxVar2 = aoux.a;
                    }
                    createBuilder.copyOnWrite();
                    aquq aquqVar4 = (aquq) createBuilder.instance;
                    aouxVar2.getClass();
                    aquqVar4.f = aouxVar2;
                    aquqVar4.b |= 4;
                    aoob aoobVar = aqutVar.h;
                    createBuilder.copyOnWrite();
                    aquq aquqVar5 = (aquq) createBuilder.instance;
                    aoobVar.getClass();
                    aquqVar5.b |= 8;
                    aquqVar5.g = aoobVar;
                    e((aquq) createBuilder.mo39build(), ajrsVar);
                }
            }
        }
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        ajqi ajqiVar = this.l;
        if (ajqiVar != null) {
            ajqiVar.e(this.b);
        }
        this.h.removeAllViews();
    }
}
