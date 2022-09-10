package gen_binder.root;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes.dex */
public final class RootModule$Generated {
    private HashMap<String, Integer> a;

    public final void a(Class<?> cls, czhd czhdVar) {
        int i;
        synchronized (this) {
            if (this.a == null) {
                HashMap<String, Integer> hashMap = new HashMap<>(2);
                this.a = hashMap;
                hashMap.put(czht.a, 0);
            }
        }
        Integer num = this.a.get(cls.getName());
        if (num == null) {
            return;
        }
        if (num.intValue() >= 0) {
            if (num.intValue() != 0) {
                throw new IllegalStateException("Index not handled. This implies a bug in the ModuleCompiler.");
            }
            synchronized (czht.class) {
                if (czht.b == null) {
                    czht.b = new czhu();
                }
            }
            czhq[] czhqVarArr = {new czhs()};
            for (i = 0; i <= 0; i++) {
                czhq czhqVar = czhqVarArr[i];
                czhdVar.e();
                synchronized (czhdVar.d(czhq.class)) {
                    if (czho.a(czhd.a)) {
                        if (!czhdVar.c.containsKey(czhq.class)) {
                            if (czhdVar.e.containsKey(czhq.class)) {
                                String valueOf = String.valueOf(czhq.class);
                                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 85);
                                sb.append("Attempt to multibind an object without a key, even though other instances have keys: ");
                                sb.append(valueOf);
                                throw new IllegalStateException(sb.toString());
                            }
                        } else {
                            String valueOf2 = String.valueOf(czhq.class);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 42);
                            sb2.append("Attempt to multibind single-bound object: ");
                            sb2.append(valueOf2);
                            throw new IllegalStateException(sb2.toString());
                        }
                    }
                    List<?> list = czhdVar.d.get(czhq.class);
                    if (list == null) {
                        list = new ArrayList<>();
                        czhdVar.d.put(czhq.class, list);
                    }
                    list.add(czhqVar);
                }
            }
            return;
        }
        throw new IllegalStateException("Index not handled. This implies a bug in the ModuleCompiler.");
    }
}
