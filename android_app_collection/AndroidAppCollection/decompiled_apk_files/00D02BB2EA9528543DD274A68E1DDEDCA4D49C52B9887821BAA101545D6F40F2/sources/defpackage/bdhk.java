package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: bdhk  reason: default package */
/* loaded from: classes3.dex */
public abstract class bdhk {
    private final dbty<dcdc<dwfl>> a = new dbty(this) { // from class: bdhh
        private final bdhk a;

        {
            this.a = this;
        }

        @Override // defpackage.dbty
        public final Object a() {
            return dcbg.b(this.a.a().entrySet()).s(bdhi.a).o(bdhj.a).z();
        }
    };

    public static bdhk c(Map<String, String> map, @dzsi bdhg bdhgVar) {
        return new bdhd(map, bdhgVar);
    }

    public abstract Map<String, String> a();

    @dzsi
    public abstract bdhg b();

    public final dcdc<dwfl> d() {
        return this.a.a();
    }
}
