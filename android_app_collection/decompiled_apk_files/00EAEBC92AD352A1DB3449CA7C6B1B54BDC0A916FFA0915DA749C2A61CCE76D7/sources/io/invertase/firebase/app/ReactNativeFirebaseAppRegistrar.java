package io.invertase.firebase.app;

import androidx.annotation.Keep;
import c.e.b.p.g;
import com.google.firebase.components.d;
import com.google.firebase.components.h;
import java.util.Collections;
import java.util.List;
@Keep
/* loaded from: classes.dex */
public class ReactNativeFirebaseAppRegistrar implements h {
    @Override // com.google.firebase.components.h
    public List<d<?>> getComponents() {
        return Collections.singletonList(g.a("react-native-firebase", c.f10233a));
    }
}
