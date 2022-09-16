package defpackage;

import com.google.android.youtube.R;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: iyr  reason: default package */
/* loaded from: classes3.dex */
public final class iyr implements aafl, yiw {
    private final airr a;
    private final azqb b;
    private final yzj c;

    public iyr(airr airrVar, azqb azqbVar, yzj yzjVar) {
        this.a = airrVar;
        this.b = azqbVar;
        yzjVar.getClass();
        this.c = yzjVar;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        Void r1 = (Void) obj;
        this.c.c(R.string.no_subtitles);
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Void r1 = (Void) obj;
        ((aibg) this.b.get()).r((List) obj2);
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        this.a.C(this);
    }
}
