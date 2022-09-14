package com.crashlytics.android.core;

import android.annotation.SuppressLint;
import b.a.a.a.a.f.c;
import b.a.a.a.a.f.d;
/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"CommitPrefEdits"})
/* loaded from: classes.dex */
public class PreferenceManager {
    static final String PREF_ALWAYS_SEND_REPORTS_KEY = "always_send_reports_opt_in";
    private static final String PREF_MIGRATION_COMPLETE = "preferences_migration_complete";
    private static final boolean SHOULD_ALWAYS_SEND_REPORTS_DEFAULT = false;
    private final CrashlyticsCore kit;
    private final c preferenceStore;

    public static PreferenceManager create(c cVar, CrashlyticsCore crashlyticsCore) {
        return new PreferenceManager(cVar, crashlyticsCore);
    }

    public PreferenceManager(c cVar, CrashlyticsCore crashlyticsCore) {
        this.preferenceStore = cVar;
        this.kit = crashlyticsCore;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setShouldAlwaysSendReports(boolean z) {
        this.preferenceStore.a(this.preferenceStore.b().putBoolean(PREF_ALWAYS_SEND_REPORTS_KEY, z));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean shouldAlwaysSendReports() {
        if (!this.preferenceStore.a().contains(PREF_MIGRATION_COMPLETE)) {
            d dVar = new d(this.kit);
            if (!this.preferenceStore.a().contains(PREF_ALWAYS_SEND_REPORTS_KEY) && dVar.a().contains(PREF_ALWAYS_SEND_REPORTS_KEY)) {
                this.preferenceStore.a(this.preferenceStore.b().putBoolean(PREF_ALWAYS_SEND_REPORTS_KEY, dVar.a().getBoolean(PREF_ALWAYS_SEND_REPORTS_KEY, false)));
            }
            this.preferenceStore.a(this.preferenceStore.b().putBoolean(PREF_MIGRATION_COMPLETE, true));
        }
        return this.preferenceStore.a().getBoolean(PREF_ALWAYS_SEND_REPORTS_KEY, false);
    }
}
