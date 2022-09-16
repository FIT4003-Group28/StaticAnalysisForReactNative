package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: jly  reason: default package */
/* loaded from: classes3.dex */
public final class jly extends jlq {
    private final Context a;

    public jly(Context context) {
        super(jbc.class, aube.class);
        this.a = context;
    }

    @Override // defpackage.jmf
    public final /* bridge */ /* synthetic */ Object b(Object obj, amup amupVar) {
        jbc jbcVar = (jbc) obj;
        String string = this.a.getString(R.string.video_views, jbcVar.i);
        String str = jbcVar.d;
        aopa createBuilder = aube.a.createBuilder();
        aopa createBuilder2 = aubj.a.createBuilder();
        aopa createBuilder3 = aubi.a.createBuilder();
        arag g = ajgl.g(jbcVar.b);
        createBuilder3.copyOnWrite();
        aubi aubiVar = (aubi) createBuilder3.instance;
        g.getClass();
        aubiVar.c = g;
        aubiVar.b |= 1;
        arag g2 = !TextUtils.isEmpty(str) ? ajgl.g(TextUtils.concat(str, " · ", string).toString()) : ajgl.g(string.toString());
        createBuilder3.copyOnWrite();
        aubi aubiVar2 = (aubi) createBuilder3.instance;
        g2.getClass();
        aubiVar2.d = g2;
        aubiVar2.b |= 2;
        aubi aubiVar3 = (aubi) createBuilder3.mo39build();
        createBuilder2.copyOnWrite();
        aubj aubjVar = (aubj) createBuilder2.instance;
        aubiVar3.getClass();
        aubjVar.c = aubiVar3;
        aubjVar.b = 128392103;
        aubj aubjVar2 = (aubj) createBuilder2.mo39build();
        createBuilder.copyOnWrite();
        aube aubeVar = (aube) createBuilder.instance;
        aubjVar2.getClass();
        aubeVar.i = aubjVar2;
        aubeVar.b |= 4096;
        return (aube) createBuilder.mo39build();
    }
}
