package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bbsq  reason: default package */
/* loaded from: classes3.dex */
public final class bbsq extends bbue {
    public List<bbtm> a;
    public String b;

    @Override // defpackage.bbue
    public final void a(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null photosLabel");
    }
}
