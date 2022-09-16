package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: xtq  reason: default package */
/* loaded from: classes4.dex */
public final class xtq extends ajsl {
    public final xlt a;
    public final xxx b;
    private final View c;
    private final Context d;
    private final ViewGroup e;
    private final xtn f;

    public xtq(Context context, xlt xltVar, xtn xtnVar, xxx xxxVar) {
        this.d = context;
        this.a = xltVar;
        this.f = xtnVar;
        xxxVar.getClass();
        this.b = xxxVar;
        View inflate = View.inflate(context, R.layout.comment_poll, null);
        this.c = inflate;
        this.e = (ViewGroup) inflate.findViewById(R.id.comment_poll_list);
    }

    public static final void f(aopc aopcVar, ajrs ajrsVar) {
        if (aopcVar != null) {
            aopa createBuilder = auqr.a.createBuilder();
            String k = ajrsVar.a.k();
            createBuilder.copyOnWrite();
            auqr auqrVar = (auqr) createBuilder.instance;
            k.getClass();
            auqrVar.b |= 1;
            auqrVar.c = k;
            aopcVar.e(auqs.b, (auqr) createBuilder.mo39build());
        }
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajsl
    public final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        boolean z;
        aufe aufeVar = (aufe) obj;
        xmd xmdVar = (xmd) ajrsVar.c("commentThreadMutator");
        xmdVar.getClass();
        int i = 0;
        while (true) {
            if (i >= aufeVar.f.size()) {
                z = false;
                break;
            } else if (((aufc) aufeVar.f.get(i)).d) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        int i2 = 0;
        while (i2 < aufeVar.f.size()) {
            aopa mo52toBuilder = ((aufc) aufeVar.f.get(i2)).mo52toBuilder();
            aufc aufcVar = (aufc) mo52toBuilder.instance;
            if ((aufcVar.b & 128) != 0) {
                apzg apzgVar = aufcVar.i;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                aopc aopcVar = (aopc) apzgVar.mo52toBuilder();
                f(aopcVar, ajrsVar);
                mo52toBuilder.copyOnWrite();
                aufc aufcVar2 = (aufc) mo52toBuilder.instance;
                apzg apzgVar2 = (apzg) aopcVar.mo39build();
                apzgVar2.getClass();
                aufcVar2.i = apzgVar2;
                aufcVar2.b |= 128;
            }
            aufc aufcVar3 = (aufc) mo52toBuilder.instance;
            if ((aufcVar3.b & 256) != 0) {
                apzg apzgVar3 = aufcVar3.j;
                if (apzgVar3 == null) {
                    apzgVar3 = apzg.a;
                }
                aopc aopcVar2 = (aopc) apzgVar3.mo52toBuilder();
                f(aopcVar2, ajrsVar);
                mo52toBuilder.copyOnWrite();
                aufc aufcVar4 = (aufc) mo52toBuilder.instance;
                apzg apzgVar4 = (apzg) aopcVar2.mo39build();
                apzgVar4.getClass();
                aufcVar4.j = apzgVar4;
                aufcVar4.b |= 256;
            }
            aufc aufcVar5 = (aufc) mo52toBuilder.instance;
            if ((aufcVar5.b & 8) != 0) {
                apzg apzgVar5 = aufcVar5.e;
                if (apzgVar5 == null) {
                    apzgVar5 = apzg.a;
                }
                aopc aopcVar3 = (aopc) apzgVar5.mo52toBuilder();
                f(aopcVar3, ajrsVar);
                mo52toBuilder.copyOnWrite();
                aufc aufcVar6 = (aufc) mo52toBuilder.instance;
                apzg apzgVar6 = (apzg) aopcVar3.mo39build();
                apzgVar6.getClass();
                aufcVar6.e = apzgVar6;
                aufcVar6.b |= 8;
            }
            ajrs d = this.f.d(ajrsVar);
            d.f("has_voted", Boolean.valueOf(z));
            d.f("is_last_item", Boolean.valueOf(i2 == aufeVar.f.size() + (-1)));
            View c = this.f.c(d, (aufc) mo52toBuilder.mo39build());
            this.e.addView(c);
            c.setOnClickListener(new xtp(this, xmdVar, aufeVar, mo52toBuilder, ajrsVar));
            i2++;
        }
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aufe) obj).g.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.f.e(this.e);
    }
}
