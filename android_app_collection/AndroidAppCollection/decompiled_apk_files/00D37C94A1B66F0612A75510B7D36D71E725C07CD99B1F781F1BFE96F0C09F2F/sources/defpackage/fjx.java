package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: fjx  reason: default package */
/* loaded from: classes3.dex */
public final class fjx extends ajsl {
    public final gga a;
    public final TextView b;
    private final Map c;

    public fjx(Context context, ggb ggbVar, akbi akbiVar, Map map) {
        this(context, ggbVar, akbiVar, map, R.layout.button);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        apoj apojVar = (apoj) obj;
        HashMap hashMap = new HashMap();
        Map map = this.c;
        if (map == null) {
            map = Collections.emptyMap();
        }
        hashMap.putAll(map);
        hashMap.putAll(ajrsVar.e());
        this.a.a(apojVar, ajrsVar.a, hashMap);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((apoj) obj).t.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.a.a(null, null, null);
    }

    public fjx(Context context, ggb ggbVar, akbi akbiVar, Map map, int i) {
        TextView textView = (TextView) LayoutInflater.from(context).inflate(i, (ViewGroup) null, false);
        this.b = textView;
        gga a = ggbVar.a(textView);
        this.a = a;
        a.e(R.dimen.text_button_icon_padding);
        if (akbiVar != null) {
            a.d = akbiVar;
        }
        this.c = map;
    }
}
