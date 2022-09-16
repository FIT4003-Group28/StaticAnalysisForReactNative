package c.e.b;

import com.google.android.gms.common.internal.s;
/* loaded from: classes.dex */
public class f extends Exception {
    /* JADX INFO: Access modifiers changed from: protected */
    @Deprecated
    public f() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String str) {
        super(str);
        s.a(str, (Object) "Detail message must not be empty");
    }
}
