package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: yut  reason: default package */
/* loaded from: classes7.dex */
public final class yut extends dbus<String, x<yvk>> {
    final /* synthetic */ yuu a;

    public yut(yuu yuuVar) {
        this.a = yuuVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.app.Activity, m] */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.app.Activity, m] */
    @Override // defpackage.dbus
    public final Map<String, x<yvk>> a(Iterable<? extends String> iterable) {
        final yuo yuoVar = new yuo();
        yuoVar.a.b(this.a.k, new aa(this, yuoVar) { // from class: yup
            private final yut a;
            private final yuo b;

            {
                this.a = this;
                this.b = yuoVar;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [android.app.Activity, m] */
            @Override // defpackage.aa
            public final void m(Object obj) {
                List list = (List) obj;
                this.b.a.e(this.a.a.k);
            }
        });
        HashMap hashMap = new HashMap();
        z<List<yvk>> zVar = yuoVar.a;
        for (final String str : iterable) {
            final x xVar = new x();
            aa aaVar = new aa(this, xVar, str) { // from class: yuq
                private final yut a;
                private final x b;
                private final String c;

                {
                    this.a = this;
                    this.b = xVar;
                    this.c = str;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r6v5, types: [android.app.Activity, m] */
                @Override // defpackage.aa
                public final void m(Object obj) {
                    yut yutVar = this.a;
                    x xVar2 = this.b;
                    final String str2 = this.c;
                    dbsl dbslVar = new dbsl(str2) { // from class: yus
                        private final String a;

                        {
                            this.a = str2;
                        }

                        @Override // defpackage.dbsl
                        public final boolean a(Object obj2) {
                            return this.a.equals(((yvk) obj2).a());
                        }
                    };
                    yvj e = yvk.e();
                    e.d(str2);
                    e.b(dcdc.e());
                    e.c(dcdc.e());
                    e.e(1);
                    xVar2.g((yvk) dcft.l((List) obj, dbslVar, e.a()));
                    xVar2.e(yutVar.a.k);
                }
            };
            xVar.b(this.a.k, yur.a);
            xVar.m(zVar, aaVar);
            hashMap.put(str, xVar);
        }
        yvl yvlVar = this.a.g;
        yuy yuyVar = new yuy();
        dcdc<String> q = dcdc.q(iterable);
        if (q != null) {
            yuyVar.a = q;
            String str2 = yuyVar.a == null ? " vehicleTokens" : "";
            if (!str2.isEmpty()) {
                throw new IllegalStateException(str2.length() != 0 ? "Missing required properties:".concat(str2) : new String("Missing required properties:"));
            }
            yvlVar.a(new yuz(yuyVar.a), yuoVar);
            return hashMap;
        }
        throw new NullPointerException("Null vehicleTokens");
    }

    @Override // defpackage.dbus
    public final /* bridge */ /* synthetic */ x<yvk> b(String str) {
        throw new UnsupportedOperationException("Don't fetch polylines for a single vehicle. Use loadAll() instead.");
    }
}
