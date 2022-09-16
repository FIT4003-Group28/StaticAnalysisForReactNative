package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.widget.AdapterView;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: crl  reason: default package */
/* loaded from: classes5.dex */
public class crl extends bopt implements ctm {
    public final cqt a;
    private final cjqy c;
    private final dzsj<begg> d;
    private final List<cqkp> e;

    public crl(cqt cqtVar, cjqy cjqyVar, dzsj<begg> dzsjVar, Context context, bokk bokkVar, String str, String str2, String str3, Integer num, int i, ddho ddhoVar, boolean z, boolean z2, boolean z3, bomt bomtVar, cqjg cqjgVar, boolean z4, boolean z5, int i2) {
        super(context, bokkVar, str, str2, str3, str, num, 2131231754, ddhoVar, null, true, false, true, bomtVar, cqjgVar, false, null, true, 1);
        this.e = new ArrayList();
        this.a = cqtVar;
        this.c = cjqyVar;
        this.d = dzsjVar;
    }

    public void a(List<bxmh> list) {
        this.e.clear();
        if (!list.isEmpty()) {
            this.e.add(new crm(list.size()));
            for (bxmh bxmhVar : list) {
                dwjj dwjjVar = bxmhVar.b;
                if (dwjjVar == null) {
                    dwjjVar = dwjj.k;
                }
                dxbp dxbpVar = dwjjVar.b;
                if (dxbpVar == null) {
                    dxbpVar = dxbp.x;
                }
                SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) ((dxbpVar.a & 2) != 0 ? dxbpVar.c : dxbpVar.b));
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(C().getResources().getColor(R.color.qu_grey_600));
                dxbc dxbcVar = dxbpVar.e;
                if (dxbcVar == null) {
                    dxbcVar = dxbc.b;
                }
                dsrj<dxbr> dsrjVar = dxbcVar.a;
                if (dsrjVar != null) {
                    for (dxbr dxbrVar : dsrjVar) {
                        int i = dxbrVar.a;
                        if ((i & 32) != 0 && (i & 64) != 0 && dxbrVar.e - dxbrVar.d < append.length()) {
                            append.setSpan(foregroundColorSpan, Math.min(append.length(), dxbrVar.d), Math.min(append.length(), dxbrVar.e), 33);
                        }
                    }
                }
                this.e.add(new cro(this.a, append, dxbpVar.d, bxmhVar, this.c, this.d.a()));
            }
        }
        cqkx.p(this);
    }

    @Override // defpackage.ctm
    public List<cqkp> b() {
        return this.e;
    }

    @Override // defpackage.ctm
    public AdapterView.OnItemClickListener c() {
        return new crk(this);
    }
}
