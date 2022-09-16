package com.google.android.apps.youtube.app.fragments.panels;

import com.google.android.apps.youtube.app.common.ui.navigation.panels.PanelDescriptor;
import com.google.apps.tiktok.account.AccountId;
import j$.util.Optional;
import java.lang.reflect.InvocationTargetException;
/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class PanelFragmentDescriptor implements PanelDescriptor {
    public static PanelFragmentDescriptor e(Class cls) {
        return new AutoValue_PanelFragmentDescriptor(cls, null);
    }

    public abstract AccountId a();

    public abstract Class b();

    @Override // com.google.android.apps.youtube.app.common.ui.navigation.panels.PanelDescriptor
    public final Optional c() {
        try {
            dp dpVar = (dp) b().getConstructor(new Class[0]).newInstance(new Object[0]);
            if (a() != null) {
                AccountId a = a();
                a.getClass();
                aqxo.u(dpVar instanceof axoo, "Fragment %s is not a TikTok Fragment", dpVar);
                aqxo.u(((axoo) dpVar).lH() instanceof amhs, "Fragment %s is not a TikTok account Fragment", dpVar);
                amhs.a(dpVar, a);
            }
            return Optional.of(dpVar);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            zep.d("Failed to create Fragment: ", e);
            return Optional.empty();
        }
    }

    @Override // com.google.android.apps.youtube.app.common.ui.navigation.panels.PanelDescriptor
    public final String d() {
        return b().getName();
    }
}
