package defpackage;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import com.google.android.apps.gmm.directions.maneuvers.Maneuvers$BaseTurnManeuver;
import com.google.android.apps.gmm.directions.maneuvers.Maneuvers$Maneuver;
import com.google.android.apps.gmm.directions.maneuvers.Maneuvers$RoundaboutManeuver;
import com.google.android.apps.maps.R;
import java.io.ByteArrayOutputStream;
/* compiled from: PG */
/* renamed from: vrv  reason: default package */
/* loaded from: classes7.dex */
public final class vrv {
    private static final Maneuvers$Maneuver[] a;
    private static final Maneuvers$Maneuver[] b;

    static {
        final dpdn dpdnVar = dpdn.SIDE_LEFT;
        final dpdp dpdpVar = dpdp.TURN_NORMAL;
        final dpdn dpdnVar2 = dpdn.SIDE_RIGHT;
        final dpdp dpdpVar2 = dpdp.TURN_NORMAL;
        final dpdn dpdnVar3 = dpdn.SIDE_LEFT;
        final dpdp dpdpVar3 = dpdp.TURN_SLIGHT;
        final dpdn dpdnVar4 = dpdn.SIDE_RIGHT;
        final dpdp dpdpVar4 = dpdp.TURN_SLIGHT;
        final dpdn dpdnVar5 = dpdn.SIDE_LEFT;
        final dpdp dpdpVar5 = dpdp.TURN_KEEP;
        final dpdn dpdnVar6 = dpdn.SIDE_RIGHT;
        final dpdp dpdpVar6 = dpdp.TURN_KEEP;
        final dpdn dpdnVar7 = dpdn.SIDE_LEFT;
        final dpdp dpdpVar7 = dpdp.TURN_SHARP;
        final dpdn dpdnVar8 = dpdn.SIDE_RIGHT;
        final dpdp dpdpVar8 = dpdp.TURN_SHARP;
        final dpdn dpdnVar9 = dpdn.SIDE_RIGHT;
        final dpdp dpdpVar9 = dpdp.TURN_UTURN;
        final dpdn dpdnVar10 = dpdn.SIDE_UNSPECIFIED;
        final dpdp dpdpVar10 = dpdp.TURN_UTURN;
        final dpdn dpdnVar11 = dpdn.SIDE_UNSPECIFIED;
        final dpdp dpdpVar11 = dpdp.TURN_STRAIGHT;
        final dpdn dpdnVar12 = dpdn.SIDE_LEFT;
        final dpdp dpdpVar12 = dpdp.TURN_NORMAL;
        final dpdn dpdnVar13 = dpdn.SIDE_RIGHT;
        final dpdp dpdpVar13 = dpdp.TURN_NORMAL;
        final dpdn dpdnVar14 = dpdn.SIDE_LEFT;
        final dpdp dpdpVar14 = dpdp.TURN_SLIGHT;
        final dpdn dpdnVar15 = dpdn.SIDE_RIGHT;
        final dpdp dpdpVar15 = dpdp.TURN_SLIGHT;
        final dpdn dpdnVar16 = dpdn.SIDE_LEFT;
        final dpdp dpdpVar16 = dpdp.TURN_KEEP;
        final dpdn dpdnVar17 = dpdn.SIDE_RIGHT;
        final dpdp dpdpVar17 = dpdp.TURN_KEEP;
        final dpdn dpdnVar18 = dpdn.SIDE_LEFT;
        final dpdp dpdpVar18 = dpdp.TURN_SHARP;
        final dpdn dpdnVar19 = dpdn.SIDE_RIGHT;
        final dpdp dpdpVar19 = dpdp.TURN_SHARP;
        final dpdn dpdnVar20 = dpdn.SIDE_LEFT;
        final dpdp dpdpVar20 = dpdp.TURN_NORMAL;
        final dpdn dpdnVar21 = dpdn.SIDE_RIGHT;
        final dpdp dpdpVar21 = dpdp.TURN_NORMAL;
        final dpdn dpdnVar22 = dpdn.SIDE_LEFT;
        final dpdp dpdpVar22 = dpdp.TURN_SLIGHT;
        final dpdn dpdnVar23 = dpdn.SIDE_RIGHT;
        final dpdp dpdpVar23 = dpdp.TURN_SLIGHT;
        final dpdn dpdnVar24 = dpdn.SIDE_LEFT;
        final dpdp dpdpVar24 = dpdp.TURN_KEEP;
        final dpdn dpdnVar25 = dpdn.SIDE_RIGHT;
        final dpdp dpdpVar25 = dpdp.TURN_KEEP;
        final dpdn dpdnVar26 = dpdn.SIDE_LEFT;
        final dpdp dpdpVar26 = dpdp.TURN_SHARP;
        final dpdn dpdnVar27 = dpdn.SIDE_RIGHT;
        final dpdp dpdpVar27 = dpdp.TURN_SHARP;
        a = new Maneuvers$Maneuver[]{new Maneuvers$Maneuver(dgau.MANEUVER_UNKNOWN, dpdn.SIDE_UNSPECIFIED, false, R.raw.da_turn_unknown), new Maneuvers$Maneuver(dgau.DEPART, dpdn.SIDE_UNSPECIFIED, false, R.raw.da_turn_depart), new Maneuvers$Maneuver(dgau.DESTINATION, dpdn.SIDE_RIGHT, false, R.raw.da_turn_arrive_right), new Maneuvers$Maneuver(dgau.DESTINATION, dpdn.SIDE_LEFT, true, R.raw.da_turn_arrive_right), new Maneuvers$Maneuver(dgau.DESTINATION, dpdn.SIDE_UNSPECIFIED, false, R.raw.da_turn_arrive), new Maneuvers$Maneuver(dgau.NAME_CHANGE, dpdn.SIDE_UNSPECIFIED, false, R.raw.da_turn_straight), new Maneuvers$BaseTurnManeuver(dpdnVar, dpdpVar, true, R.raw.da_turn_right) { // from class: com.google.android.apps.gmm.directions.maneuvers.Maneuvers$TurnManeuver
            {
                dgau dgauVar = dgau.TURN;
            }
        }, new Maneuvers$BaseTurnManeuver(dpdnVar2, dpdpVar2, false, R.raw.da_turn_right) { // from class: com.google.android.apps.gmm.directions.maneuvers.Maneuvers$TurnManeuver
            {
                dgau dgauVar = dgau.TURN;
            }
        }, new Maneuvers$BaseTurnManeuver(dpdnVar3, dpdpVar3, true, R.raw.da_turn_slight_right) { // from class: com.google.android.apps.gmm.directions.maneuvers.Maneuvers$TurnManeuver
            {
                dgau dgauVar = dgau.TURN;
            }
        }, new Maneuvers$BaseTurnManeuver(dpdnVar4, dpdpVar4, false, R.raw.da_turn_slight_right) { // from class: com.google.android.apps.gmm.directions.maneuvers.Maneuvers$TurnManeuver
            {
                dgau dgauVar = dgau.TURN;
            }
        }, new Maneuvers$BaseTurnManeuver(dpdnVar5, dpdpVar5, true, R.raw.da_turn_fork_right) { // from class: com.google.android.apps.gmm.directions.maneuvers.Maneuvers$TurnManeuver
            {
                dgau dgauVar = dgau.TURN;
            }
        }, new Maneuvers$BaseTurnManeuver(dpdnVar6, dpdpVar6, false, R.raw.da_turn_fork_right) { // from class: com.google.android.apps.gmm.directions.maneuvers.Maneuvers$TurnManeuver
            {
                dgau dgauVar = dgau.TURN;
            }
        }, new Maneuvers$BaseTurnManeuver(dpdnVar7, dpdpVar7, true, R.raw.da_turn_sharp_right) { // from class: com.google.android.apps.gmm.directions.maneuvers.Maneuvers$TurnManeuver
            {
                dgau dgauVar = dgau.TURN;
            }
        }, new Maneuvers$BaseTurnManeuver(dpdnVar8, dpdpVar8, false, R.raw.da_turn_sharp_right) { // from class: com.google.android.apps.gmm.directions.maneuvers.Maneuvers$TurnManeuver
            {
                dgau dgauVar = dgau.TURN;
            }
        }, new Maneuvers$BaseTurnManeuver(dpdnVar9, dpdpVar9, true, R.raw.da_turn_uturn) { // from class: com.google.android.apps.gmm.directions.maneuvers.Maneuvers$TurnManeuver
            {
                dgau dgauVar = dgau.TURN;
            }
        }, new Maneuvers$BaseTurnManeuver(dpdnVar10, dpdpVar10, false, R.raw.da_turn_uturn) { // from class: com.google.android.apps.gmm.directions.maneuvers.Maneuvers$TurnManeuver
            {
                dgau dgauVar = dgau.TURN;
            }
        }, new Maneuvers$BaseTurnManeuver(dpdnVar11, dpdpVar11, false, R.raw.da_turn_straight) { // from class: com.google.android.apps.gmm.directions.maneuvers.Maneuvers$TurnManeuver
            {
                dgau dgauVar = dgau.TURN;
            }
        }, new Maneuvers$Maneuver(dgau.TURN, dpdn.SIDE_LEFT, true, R.raw.da_turn_right), new Maneuvers$Maneuver(dgau.TURN, dpdn.SIDE_RIGHT, false, R.raw.da_turn_right), new Maneuvers$BaseTurnManeuver(dpdnVar12, dpdpVar12, true, R.raw.da_turn_right) { // from class: com.google.android.apps.gmm.directions.maneuvers.Maneuvers$OnRampManeuver
            {
                dgau dgauVar = dgau.ON_RAMP;
            }
        }, new Maneuvers$BaseTurnManeuver(dpdnVar13, dpdpVar13, false, R.raw.da_turn_right) { // from class: com.google.android.apps.gmm.directions.maneuvers.Maneuvers$OnRampManeuver
            {
                dgau dgauVar = dgau.ON_RAMP;
            }
        }, new Maneuvers$BaseTurnManeuver(dpdnVar14, dpdpVar14, true, R.raw.da_turn_slight_right) { // from class: com.google.android.apps.gmm.directions.maneuvers.Maneuvers$OnRampManeuver
            {
                dgau dgauVar = dgau.ON_RAMP;
            }
        }, new Maneuvers$BaseTurnManeuver(dpdnVar15, dpdpVar15, false, R.raw.da_turn_slight_right) { // from class: com.google.android.apps.gmm.directions.maneuvers.Maneuvers$OnRampManeuver
            {
                dgau dgauVar = dgau.ON_RAMP;
            }
        }, new Maneuvers$BaseTurnManeuver(dpdnVar16, dpdpVar16, true, R.raw.da_turn_fork_right) { // from class: com.google.android.apps.gmm.directions.maneuvers.Maneuvers$OnRampManeuver
            {
                dgau dgauVar = dgau.ON_RAMP;
            }
        }, new Maneuvers$BaseTurnManeuver(dpdnVar17, dpdpVar17, false, R.raw.da_turn_fork_right) { // from class: com.google.android.apps.gmm.directions.maneuvers.Maneuvers$OnRampManeuver
            {
                dgau dgauVar = dgau.ON_RAMP;
            }
        }, new Maneuvers$BaseTurnManeuver(dpdnVar18, dpdpVar18, true, R.raw.da_turn_sharp_right) { // from class: com.google.android.apps.gmm.directions.maneuvers.Maneuvers$OnRampManeuver
            {
                dgau dgauVar = dgau.ON_RAMP;
            }
        }, new Maneuvers$BaseTurnManeuver(dpdnVar19, dpdpVar19, false, R.raw.da_turn_sharp_right) { // from class: com.google.android.apps.gmm.directions.maneuvers.Maneuvers$OnRampManeuver
            {
                dgau dgauVar = dgau.ON_RAMP;
            }
        }, new Maneuvers$Maneuver(dgau.ON_RAMP, dpdn.SIDE_UNSPECIFIED, false, R.raw.da_turn_straight), new Maneuvers$BaseTurnManeuver(dpdnVar20, dpdpVar20, true, R.raw.da_turn_ramp_right) { // from class: com.google.android.apps.gmm.directions.maneuvers.Maneuvers$OffRampManeuver
            {
                dgau dgauVar = dgau.OFF_RAMP;
            }
        }, new Maneuvers$BaseTurnManeuver(dpdnVar21, dpdpVar21, false, R.raw.da_turn_ramp_right) { // from class: com.google.android.apps.gmm.directions.maneuvers.Maneuvers$OffRampManeuver
            {
                dgau dgauVar = dgau.OFF_RAMP;
            }
        }, new Maneuvers$BaseTurnManeuver(dpdnVar22, dpdpVar22, true, R.raw.da_turn_slight_right) { // from class: com.google.android.apps.gmm.directions.maneuvers.Maneuvers$OffRampManeuver
            {
                dgau dgauVar = dgau.OFF_RAMP;
            }
        }, new Maneuvers$BaseTurnManeuver(dpdnVar23, dpdpVar23, false, R.raw.da_turn_slight_right) { // from class: com.google.android.apps.gmm.directions.maneuvers.Maneuvers$OffRampManeuver
            {
                dgau dgauVar = dgau.OFF_RAMP;
            }
        }, new Maneuvers$BaseTurnManeuver(dpdnVar24, dpdpVar24, true, R.raw.da_turn_fork_right) { // from class: com.google.android.apps.gmm.directions.maneuvers.Maneuvers$OffRampManeuver
            {
                dgau dgauVar = dgau.OFF_RAMP;
            }
        }, new Maneuvers$BaseTurnManeuver(dpdnVar25, dpdpVar25, false, R.raw.da_turn_fork_right) { // from class: com.google.android.apps.gmm.directions.maneuvers.Maneuvers$OffRampManeuver
            {
                dgau dgauVar = dgau.OFF_RAMP;
            }
        }, new Maneuvers$BaseTurnManeuver(dpdnVar26, dpdpVar26, true, R.raw.da_turn_sharp_right) { // from class: com.google.android.apps.gmm.directions.maneuvers.Maneuvers$OffRampManeuver
            {
                dgau dgauVar = dgau.OFF_RAMP;
            }
        }, new Maneuvers$BaseTurnManeuver(dpdnVar27, dpdpVar27, false, R.raw.da_turn_sharp_right) { // from class: com.google.android.apps.gmm.directions.maneuvers.Maneuvers$OffRampManeuver
            {
                dgau dgauVar = dgau.OFF_RAMP;
            }
        }, new Maneuvers$Maneuver(dgau.OFF_RAMP, dpdn.SIDE_UNSPECIFIED, false, R.raw.da_turn_straight), new Maneuvers$Maneuver(dgau.UTURN, dpdn.SIDE_RIGHT, true, R.raw.da_turn_uturn), new Maneuvers$Maneuver(dgau.UTURN, dpdn.SIDE_UNSPECIFIED, false, R.raw.da_turn_uturn), new Maneuvers$Maneuver(dgau.FORK, dpdn.SIDE_LEFT, true, R.raw.da_turn_fork_right), new Maneuvers$Maneuver(dgau.FORK, dpdn.SIDE_RIGHT, false, R.raw.da_turn_fork_right), new Maneuvers$Maneuver(dgau.MERGE, dpdn.SIDE_UNSPECIFIED, false, R.raw.da_turn_generic_merge), new Maneuvers$Maneuver(dgau.STRAIGHT, dpdn.SIDE_UNSPECIFIED, false, R.raw.da_turn_straight), new Maneuvers$Maneuver(dgau.FERRY, dpdn.SIDE_UNSPECIFIED, false, R.raw.da_turn_ferry), new Maneuvers$RoundaboutManeuver(dpdn.SIDE_RIGHT, dpdp.TURN_SHARP, false, R.raw.da_turn_roundabout_1), new Maneuvers$RoundaboutManeuver(dpdn.SIDE_RIGHT, dpdp.TURN_NORMAL, false, R.raw.da_turn_roundabout_2), new Maneuvers$RoundaboutManeuver(dpdn.SIDE_RIGHT, dpdp.TURN_SLIGHT, false, R.raw.da_turn_roundabout_3), new Maneuvers$RoundaboutManeuver(dpdn.SIDE_UNSPECIFIED, dpdp.TURN_STRAIGHT, false, R.raw.da_turn_roundabout_4), new Maneuvers$RoundaboutManeuver(dpdn.SIDE_LEFT, dpdp.TURN_SLIGHT, false, R.raw.da_turn_roundabout_5), new Maneuvers$RoundaboutManeuver(dpdn.SIDE_LEFT, dpdp.TURN_NORMAL, false, R.raw.da_turn_roundabout_6), new Maneuvers$RoundaboutManeuver(dpdn.SIDE_LEFT, dpdp.TURN_SHARP, false, R.raw.da_turn_roundabout_7), new Maneuvers$RoundaboutManeuver(dpdn.SIDE_UNSPECIFIED, dpdp.TURN_UTURN, false, R.raw.da_turn_roundabout_8), new Maneuvers$RoundaboutManeuver(dpdn.SIDE_LEFT, dpdp.TURN_SHARP, true, R.raw.da_turn_roundabout_1), new Maneuvers$RoundaboutManeuver(dpdn.SIDE_LEFT, dpdp.TURN_NORMAL, true, R.raw.da_turn_roundabout_2), new Maneuvers$RoundaboutManeuver(dpdn.SIDE_LEFT, dpdp.TURN_SLIGHT, true, R.raw.da_turn_roundabout_3), new Maneuvers$RoundaboutManeuver(dpdn.SIDE_UNSPECIFIED, dpdp.TURN_STRAIGHT, true, R.raw.da_turn_roundabout_4), new Maneuvers$RoundaboutManeuver(dpdn.SIDE_RIGHT, dpdp.TURN_SLIGHT, true, R.raw.da_turn_roundabout_5), new Maneuvers$RoundaboutManeuver(dpdn.SIDE_RIGHT, dpdp.TURN_NORMAL, true, R.raw.da_turn_roundabout_6), new Maneuvers$RoundaboutManeuver(dpdn.SIDE_RIGHT, dpdp.TURN_SHARP, true, R.raw.da_turn_roundabout_7), new Maneuvers$RoundaboutManeuver(dpdn.SIDE_UNSPECIFIED, dpdp.TURN_UTURN, true, R.raw.da_turn_roundabout_8), new Maneuvers$RoundaboutManeuver(dpdn.SIDE_UNSPECIFIED, dpdp.TURN_UNKNOWN, true, R.raw.da_turn_generic_roundabout), new Maneuvers$RoundaboutManeuver(dpdn.SIDE_UNSPECIFIED, dpdp.TURN_UNKNOWN, false, R.raw.da_turn_generic_roundabout), new Maneuvers$RoundaboutManeuver(dgau.ROUNDABOUT_ENTER, dpdn.SIDE_UNSPECIFIED, dpdp.TURN_UNKNOWN, true, R.raw.da_turn_generic_roundabout), new Maneuvers$RoundaboutManeuver(dgau.ROUNDABOUT_ENTER, dpdn.SIDE_UNSPECIFIED, dpdp.TURN_UNKNOWN, false, R.raw.da_turn_generic_roundabout), new Maneuvers$RoundaboutManeuver(dgau.ROUNDABOUT_EXIT, dpdn.SIDE_UNSPECIFIED, dpdp.TURN_UNKNOWN, true, R.raw.da_turn_roundabout_exit), new Maneuvers$RoundaboutManeuver(dgau.ROUNDABOUT_EXIT, dpdn.SIDE_UNSPECIFIED, dpdp.TURN_UNKNOWN, false, R.raw.da_turn_roundabout_exit)};
        final dpdn dpdnVar28 = dpdn.SIDE_LEFT;
        final dpdp dpdpVar28 = dpdp.TURN_NORMAL;
        final dpdn dpdnVar29 = dpdn.SIDE_RIGHT;
        final dpdp dpdpVar29 = dpdp.TURN_NORMAL;
        final dpdn dpdnVar30 = dpdn.SIDE_LEFT;
        final dpdp dpdpVar30 = dpdp.TURN_SLIGHT;
        final dpdn dpdnVar31 = dpdn.SIDE_RIGHT;
        final dpdp dpdpVar31 = dpdp.TURN_SLIGHT;
        final dpdn dpdnVar32 = dpdn.SIDE_LEFT;
        final dpdp dpdpVar32 = dpdp.TURN_KEEP;
        final dpdn dpdnVar33 = dpdn.SIDE_RIGHT;
        final dpdp dpdpVar33 = dpdp.TURN_KEEP;
        final dpdn dpdnVar34 = dpdn.SIDE_LEFT;
        final dpdp dpdpVar34 = dpdp.TURN_SHARP;
        final dpdn dpdnVar35 = dpdn.SIDE_RIGHT;
        final dpdp dpdpVar35 = dpdp.TURN_SHARP;
        final dpdn dpdnVar36 = dpdn.SIDE_RIGHT;
        final dpdp dpdpVar36 = dpdp.TURN_UTURN;
        final dpdn dpdnVar37 = dpdn.SIDE_UNSPECIFIED;
        final dpdp dpdpVar37 = dpdp.TURN_UTURN;
        final dpdn dpdnVar38 = dpdn.SIDE_UNSPECIFIED;
        final dpdp dpdpVar38 = dpdp.TURN_STRAIGHT;
        final dpdn dpdnVar39 = dpdn.SIDE_LEFT;
        final dpdp dpdpVar39 = dpdp.TURN_NORMAL;
        final dpdn dpdnVar40 = dpdn.SIDE_RIGHT;
        final dpdp dpdpVar40 = dpdp.TURN_NORMAL;
        final dpdn dpdnVar41 = dpdn.SIDE_LEFT;
        final dpdp dpdpVar41 = dpdp.TURN_SLIGHT;
        final dpdn dpdnVar42 = dpdn.SIDE_RIGHT;
        final dpdp dpdpVar42 = dpdp.TURN_SLIGHT;
        final dpdn dpdnVar43 = dpdn.SIDE_LEFT;
        final dpdp dpdpVar43 = dpdp.TURN_KEEP;
        final dpdn dpdnVar44 = dpdn.SIDE_RIGHT;
        final dpdp dpdpVar44 = dpdp.TURN_KEEP;
        final dpdn dpdnVar45 = dpdn.SIDE_LEFT;
        final dpdp dpdpVar45 = dpdp.TURN_SHARP;
        final dpdn dpdnVar46 = dpdn.SIDE_RIGHT;
        final dpdp dpdpVar46 = dpdp.TURN_SHARP;
        final dpdn dpdnVar47 = dpdn.SIDE_LEFT;
        final dpdp dpdpVar47 = dpdp.TURN_NORMAL;
        final dpdn dpdnVar48 = dpdn.SIDE_RIGHT;
        final dpdp dpdpVar48 = dpdp.TURN_NORMAL;
        final dpdn dpdnVar49 = dpdn.SIDE_LEFT;
        final dpdp dpdpVar49 = dpdp.TURN_SLIGHT;
        final dpdn dpdnVar50 = dpdn.SIDE_RIGHT;
        final dpdp dpdpVar50 = dpdp.TURN_SLIGHT;
        final dpdn dpdnVar51 = dpdn.SIDE_LEFT;
        final dpdp dpdpVar51 = dpdp.TURN_KEEP;
        final dpdn dpdnVar52 = dpdn.SIDE_RIGHT;
        final dpdp dpdpVar52 = dpdp.TURN_KEEP;
        final dpdn dpdnVar53 = dpdn.SIDE_LEFT;
        final dpdp dpdpVar53 = dpdp.TURN_SHARP;
        final dpdn dpdnVar54 = dpdn.SIDE_RIGHT;
        final dpdp dpdpVar54 = dpdp.TURN_SHARP;
        b = new Maneuvers$Maneuver[]{new Maneuvers$Maneuver(dgau.MANEUVER_UNKNOWN, dpdn.SIDE_UNSPECIFIED, false, R.raw.da_turn_unknown), new Maneuvers$Maneuver(dgau.DEPART, dpdn.SIDE_UNSPECIFIED, false, R.raw.ic_depart), new Maneuvers$Maneuver(dgau.DESTINATION, dpdn.SIDE_RIGHT, false, R.raw.ic_arrive_right), new Maneuvers$Maneuver(dgau.DESTINATION, dpdn.SIDE_LEFT, true, R.raw.ic_arrive_right), new Maneuvers$Maneuver(dgau.DESTINATION, dpdn.SIDE_UNSPECIFIED, false, R.raw.ic_place), new Maneuvers$Maneuver(dgau.NAME_CHANGE, dpdn.SIDE_UNSPECIFIED, false, R.raw.ic_straight), new Maneuvers$BaseTurnManeuver(dpdnVar28, dpdpVar28, true, R.raw.ic_turn_right) { // from class: com.google.android.apps.gmm.directions.maneuvers.Maneuvers$TurnManeuver
            {
                dgau dgauVar = dgau.TURN;
            }
        }, new Maneuvers$BaseTurnManeuver(dpdnVar29, dpdpVar29, false, R.raw.ic_turn_right) { // from class: com.google.android.apps.gmm.directions.maneuvers.Maneuvers$TurnManeuver
            {
                dgau dgauVar = dgau.TURN;
            }
        }, new Maneuvers$BaseTurnManeuver(dpdnVar30, dpdpVar30, true, R.raw.ic_turn_slight_right) { // from class: com.google.android.apps.gmm.directions.maneuvers.Maneuvers$TurnManeuver
            {
                dgau dgauVar = dgau.TURN;
            }
        }, new Maneuvers$BaseTurnManeuver(dpdnVar31, dpdpVar31, false, R.raw.ic_turn_slight_right) { // from class: com.google.android.apps.gmm.directions.maneuvers.Maneuvers$TurnManeuver
            {
                dgau dgauVar = dgau.TURN;
            }
        }, new Maneuvers$BaseTurnManeuver(dpdnVar32, dpdpVar32, true, R.raw.ic_merge_slight_right) { // from class: com.google.android.apps.gmm.directions.maneuvers.Maneuvers$TurnManeuver
            {
                dgau dgauVar = dgau.TURN;
            }
        }, new Maneuvers$BaseTurnManeuver(dpdnVar33, dpdpVar33, false, R.raw.ic_merge_slight_right) { // from class: com.google.android.apps.gmm.directions.maneuvers.Maneuvers$TurnManeuver
            {
                dgau dgauVar = dgau.TURN;
            }
        }, new Maneuvers$BaseTurnManeuver(dpdnVar34, dpdpVar34, true, R.raw.ic_turn_sharp_right) { // from class: com.google.android.apps.gmm.directions.maneuvers.Maneuvers$TurnManeuver
            {
                dgau dgauVar = dgau.TURN;
            }
        }, new Maneuvers$BaseTurnManeuver(dpdnVar35, dpdpVar35, false, R.raw.ic_turn_sharp_right) { // from class: com.google.android.apps.gmm.directions.maneuvers.Maneuvers$TurnManeuver
            {
                dgau dgauVar = dgau.TURN;
            }
        }, new Maneuvers$BaseTurnManeuver(dpdnVar36, dpdpVar36, true, R.raw.ic_u_turn) { // from class: com.google.android.apps.gmm.directions.maneuvers.Maneuvers$TurnManeuver
            {
                dgau dgauVar = dgau.TURN;
            }
        }, new Maneuvers$BaseTurnManeuver(dpdnVar37, dpdpVar37, false, R.raw.ic_u_turn) { // from class: com.google.android.apps.gmm.directions.maneuvers.Maneuvers$TurnManeuver
            {
                dgau dgauVar = dgau.TURN;
            }
        }, new Maneuvers$BaseTurnManeuver(dpdnVar38, dpdpVar38, false, R.raw.ic_straight) { // from class: com.google.android.apps.gmm.directions.maneuvers.Maneuvers$TurnManeuver
            {
                dgau dgauVar = dgau.TURN;
            }
        }, new Maneuvers$Maneuver(dgau.TURN, dpdn.SIDE_LEFT, true, R.raw.ic_turn_right), new Maneuvers$Maneuver(dgau.TURN, dpdn.SIDE_RIGHT, false, R.raw.ic_turn_right), new Maneuvers$BaseTurnManeuver(dpdnVar39, dpdpVar39, true, R.raw.ic_turn_right) { // from class: com.google.android.apps.gmm.directions.maneuvers.Maneuvers$OnRampManeuver
            {
                dgau dgauVar = dgau.ON_RAMP;
            }
        }, new Maneuvers$BaseTurnManeuver(dpdnVar40, dpdpVar40, false, R.raw.ic_turn_right) { // from class: com.google.android.apps.gmm.directions.maneuvers.Maneuvers$OnRampManeuver
            {
                dgau dgauVar = dgau.ON_RAMP;
            }
        }, new Maneuvers$BaseTurnManeuver(dpdnVar41, dpdpVar41, true, R.raw.ic_turn_slight_right) { // from class: com.google.android.apps.gmm.directions.maneuvers.Maneuvers$OnRampManeuver
            {
                dgau dgauVar = dgau.ON_RAMP;
            }
        }, new Maneuvers$BaseTurnManeuver(dpdnVar42, dpdpVar42, false, R.raw.ic_turn_slight_right) { // from class: com.google.android.apps.gmm.directions.maneuvers.Maneuvers$OnRampManeuver
            {
                dgau dgauVar = dgau.ON_RAMP;
            }
        }, new Maneuvers$BaseTurnManeuver(dpdnVar43, dpdpVar43, true, R.raw.ic_merge_slight_right) { // from class: com.google.android.apps.gmm.directions.maneuvers.Maneuvers$OnRampManeuver
            {
                dgau dgauVar = dgau.ON_RAMP;
            }
        }, new Maneuvers$BaseTurnManeuver(dpdnVar44, dpdpVar44, false, R.raw.ic_merge_slight_right) { // from class: com.google.android.apps.gmm.directions.maneuvers.Maneuvers$OnRampManeuver
            {
                dgau dgauVar = dgau.ON_RAMP;
            }
        }, new Maneuvers$BaseTurnManeuver(dpdnVar45, dpdpVar45, true, R.raw.ic_turn_sharp_right) { // from class: com.google.android.apps.gmm.directions.maneuvers.Maneuvers$OnRampManeuver
            {
                dgau dgauVar = dgau.ON_RAMP;
            }
        }, new Maneuvers$BaseTurnManeuver(dpdnVar46, dpdpVar46, false, R.raw.ic_turn_sharp_right) { // from class: com.google.android.apps.gmm.directions.maneuvers.Maneuvers$OnRampManeuver
            {
                dgau dgauVar = dgau.ON_RAMP;
            }
        }, new Maneuvers$Maneuver(dgau.ON_RAMP, dpdn.SIDE_UNSPECIFIED, false, R.raw.ic_straight), new Maneuvers$BaseTurnManeuver(dpdnVar47, dpdpVar47, true, R.raw.ic_merge_right) { // from class: com.google.android.apps.gmm.directions.maneuvers.Maneuvers$OffRampManeuver
            {
                dgau dgauVar = dgau.OFF_RAMP;
            }
        }, new Maneuvers$BaseTurnManeuver(dpdnVar48, dpdpVar48, false, R.raw.ic_merge_right) { // from class: com.google.android.apps.gmm.directions.maneuvers.Maneuvers$OffRampManeuver
            {
                dgau dgauVar = dgau.OFF_RAMP;
            }
        }, new Maneuvers$BaseTurnManeuver(dpdnVar49, dpdpVar49, true, R.raw.ic_turn_slight_right) { // from class: com.google.android.apps.gmm.directions.maneuvers.Maneuvers$OffRampManeuver
            {
                dgau dgauVar = dgau.OFF_RAMP;
            }
        }, new Maneuvers$BaseTurnManeuver(dpdnVar50, dpdpVar50, false, R.raw.ic_turn_slight_right) { // from class: com.google.android.apps.gmm.directions.maneuvers.Maneuvers$OffRampManeuver
            {
                dgau dgauVar = dgau.OFF_RAMP;
            }
        }, new Maneuvers$BaseTurnManeuver(dpdnVar51, dpdpVar51, true, R.raw.ic_merge_slight_right) { // from class: com.google.android.apps.gmm.directions.maneuvers.Maneuvers$OffRampManeuver
            {
                dgau dgauVar = dgau.OFF_RAMP;
            }
        }, new Maneuvers$BaseTurnManeuver(dpdnVar52, dpdpVar52, false, R.raw.ic_merge_slight_right) { // from class: com.google.android.apps.gmm.directions.maneuvers.Maneuvers$OffRampManeuver
            {
                dgau dgauVar = dgau.OFF_RAMP;
            }
        }, new Maneuvers$BaseTurnManeuver(dpdnVar53, dpdpVar53, true, R.raw.ic_turn_sharp_right) { // from class: com.google.android.apps.gmm.directions.maneuvers.Maneuvers$OffRampManeuver
            {
                dgau dgauVar = dgau.OFF_RAMP;
            }
        }, new Maneuvers$BaseTurnManeuver(dpdnVar54, dpdpVar54, false, R.raw.ic_turn_sharp_right) { // from class: com.google.android.apps.gmm.directions.maneuvers.Maneuvers$OffRampManeuver
            {
                dgau dgauVar = dgau.OFF_RAMP;
            }
        }, new Maneuvers$Maneuver(dgau.OFF_RAMP, dpdn.SIDE_UNSPECIFIED, false, R.raw.ic_straight), new Maneuvers$Maneuver(dgau.UTURN, dpdn.SIDE_RIGHT, true, R.raw.ic_u_turn), new Maneuvers$Maneuver(dgau.UTURN, dpdn.SIDE_UNSPECIFIED, false, R.raw.ic_u_turn), new Maneuvers$Maneuver(dgau.FORK, dpdn.SIDE_LEFT, true, R.raw.ic_merge_slight_right), new Maneuvers$Maneuver(dgau.FORK, dpdn.SIDE_RIGHT, false, R.raw.ic_merge_slight_right), new Maneuvers$Maneuver(dgau.MERGE, dpdn.SIDE_UNSPECIFIED, false, R.raw.ic_merge), new Maneuvers$Maneuver(dgau.STRAIGHT, dpdn.SIDE_UNSPECIFIED, false, R.raw.ic_straight), new Maneuvers$Maneuver(dgau.FERRY, dpdn.SIDE_UNSPECIFIED, false, R.raw.da_turn_ferry), new Maneuvers$RoundaboutManeuver(dpdn.SIDE_RIGHT, dpdp.TURN_SHARP, false, R.raw.ic_roundabout_sharp_right), new Maneuvers$RoundaboutManeuver(dpdn.SIDE_RIGHT, dpdp.TURN_NORMAL, false, R.raw.ic_roundabout_right), new Maneuvers$RoundaboutManeuver(dpdn.SIDE_RIGHT, dpdp.TURN_SLIGHT, false, R.raw.ic_roundabout_slight_right), new Maneuvers$RoundaboutManeuver(dpdn.SIDE_UNSPECIFIED, dpdp.TURN_STRAIGHT, false, R.raw.ic_roundabout_straight), new Maneuvers$RoundaboutManeuver(dpdn.SIDE_LEFT, dpdp.TURN_SLIGHT, false, R.raw.ic_roundabout_slight_left), new Maneuvers$RoundaboutManeuver(dpdn.SIDE_LEFT, dpdp.TURN_NORMAL, false, R.raw.ic_roundabout_left), new Maneuvers$RoundaboutManeuver(dpdn.SIDE_LEFT, dpdp.TURN_SHARP, false, R.raw.ic_roundabout_sharp_left), new Maneuvers$RoundaboutManeuver(dpdn.SIDE_UNSPECIFIED, dpdp.TURN_UTURN, false, R.raw.ic_roundabout_u_turn), new Maneuvers$RoundaboutManeuver(dpdn.SIDE_LEFT, dpdp.TURN_SHARP, true, R.raw.ic_roundabout_sharp_right), new Maneuvers$RoundaboutManeuver(dpdn.SIDE_LEFT, dpdp.TURN_NORMAL, true, R.raw.ic_roundabout_right), new Maneuvers$RoundaboutManeuver(dpdn.SIDE_LEFT, dpdp.TURN_SLIGHT, true, R.raw.ic_roundabout_slight_right), new Maneuvers$RoundaboutManeuver(dpdn.SIDE_UNSPECIFIED, dpdp.TURN_STRAIGHT, true, R.raw.ic_roundabout_straight), new Maneuvers$RoundaboutManeuver(dpdn.SIDE_RIGHT, dpdp.TURN_SLIGHT, true, R.raw.ic_roundabout_slight_left), new Maneuvers$RoundaboutManeuver(dpdn.SIDE_RIGHT, dpdp.TURN_NORMAL, true, R.raw.ic_roundabout_left), new Maneuvers$RoundaboutManeuver(dpdn.SIDE_RIGHT, dpdp.TURN_SHARP, true, R.raw.ic_roundabout_sharp_left), new Maneuvers$RoundaboutManeuver(dpdn.SIDE_UNSPECIFIED, dpdp.TURN_UTURN, true, R.raw.ic_roundabout_u_turn), new Maneuvers$RoundaboutManeuver(dpdn.SIDE_UNSPECIFIED, dpdp.TURN_UNKNOWN, true, R.raw.ic_roundabout), new Maneuvers$RoundaboutManeuver(dpdn.SIDE_UNSPECIFIED, dpdp.TURN_UNKNOWN, false, R.raw.ic_roundabout), new Maneuvers$RoundaboutManeuver(dgau.ROUNDABOUT_ENTER, dpdn.SIDE_UNSPECIFIED, dpdp.TURN_UNKNOWN, true, R.raw.ic_roundabout), new Maneuvers$RoundaboutManeuver(dgau.ROUNDABOUT_ENTER, dpdn.SIDE_UNSPECIFIED, dpdp.TURN_UNKNOWN, false, R.raw.ic_roundabout), new Maneuvers$RoundaboutManeuver(dgau.ROUNDABOUT_EXIT, dpdn.SIDE_UNSPECIFIED, dpdp.TURN_UNKNOWN, true, R.raw.ic_roundabout_exit), new Maneuvers$RoundaboutManeuver(dgau.ROUNDABOUT_EXIT, dpdn.SIDE_UNSPECIFIED, dpdp.TURN_UNKNOWN, false, R.raw.ic_roundabout_exit)};
    }

    @dzsi
    public static Maneuvers$Maneuver a(@dzsi amuo amuoVar) {
        if (amuoVar == null) {
            return null;
        }
        return m(amuoVar.d, amuoVar.e, amuoVar.f, amuoVar.I, amuoVar.g, false);
    }

    @dzsi
    public static Maneuvers$Maneuver b(@dzsi amuo amuoVar) {
        if (amuoVar == null) {
            return null;
        }
        return m(amuoVar.d, amuoVar.e, amuoVar.f, amuoVar.I, amuoVar.g, true);
    }

    public static Maneuvers$Maneuver c(@dzsi amuo amuoVar) {
        Maneuvers$Maneuver a2 = a(amuoVar);
        return a2 == null ? a[0] : a2;
    }

    public static Maneuvers$Maneuver d(@dzsi amuo amuoVar) {
        Maneuvers$Maneuver b2 = b(amuoVar);
        return b2 == null ? b[0] : b2;
    }

    public static boolean e(@dzsi amuo amuoVar) {
        Maneuvers$Maneuver a2 = a(amuoVar);
        return a2 != null && !a2.equals(a[0]);
    }

    public static boolean f(@dzsi amuo amuoVar) {
        Maneuvers$Maneuver b2 = b(amuoVar);
        return b2 != null && !b2.equals(b[0]);
    }

    public static Drawable g(@dzsi amuo amuoVar, int i) {
        return h(c(amuoVar), i);
    }

    public static Drawable h(Maneuvers$Maneuver maneuvers$Maneuver, int i) {
        Drawable k = k(maneuvers$Maneuver);
        k.mutate();
        k.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        return k;
    }

    public static Drawable i(@dzsi amuo amuoVar, int i) {
        return h(d(amuoVar), i);
    }

    @dzsi
    public static Drawable j(@dzsi Maneuvers$Maneuver maneuvers$Maneuver, int i) {
        if (maneuvers$Maneuver == null || maneuvers$Maneuver.equals(a[0])) {
            return null;
        }
        return h(maneuvers$Maneuver, i);
    }

    public static Drawable k(Maneuvers$Maneuver maneuvers$Maneuver) {
        bvlo a2 = bvlo.a();
        Drawable b2 = a2.b(a2.a, maneuvers$Maneuver.d, bvlw.b);
        return maneuvers$Maneuver.c ? new cqlv(b2) : b2;
    }

    public static byte[] l(amuo amuoVar, int i, int i2, int i3, Bitmap.Config config, Bitmap.CompressFormat compressFormat) {
        Bitmap d = bvlf.d(g(amuoVar, i), i2, i3, config);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        d.compress(compressFormat, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    @dzsi
    private static Maneuvers$Maneuver m(dgau dgauVar, dpdn dpdnVar, dpdp dpdpVar, @dzsi dozc dozcVar, int i, boolean z) {
        Maneuvers$Maneuver[] maneuvers$ManeuverArr = z ? b : a;
        int i2 = 0;
        while (true) {
            int length = maneuvers$ManeuverArr.length;
            if (i2 >= 66) {
                return null;
            }
            Maneuvers$Maneuver maneuvers$Maneuver = maneuvers$ManeuverArr[i2];
            if (maneuvers$Maneuver instanceof Maneuvers$RoundaboutManeuver) {
                Maneuvers$RoundaboutManeuver maneuvers$RoundaboutManeuver = (Maneuvers$RoundaboutManeuver) maneuvers$Maneuver;
                boolean z2 = true;
                boolean z3 = dozcVar == dozc.LEFT;
                if (maneuvers$RoundaboutManeuver.a != dgauVar || maneuvers$RoundaboutManeuver.c != z3) {
                    z2 = false;
                }
                if (dgauVar != dgau.ROUNDABOUT_EXIT) {
                    if (z2 && maneuvers$RoundaboutManeuver.e == dpdpVar && maneuvers$RoundaboutManeuver.b == dpdnVar) {
                        break;
                    }
                } else if (z2) {
                    break;
                }
            } else if (maneuvers$Maneuver.a(dgauVar, dpdnVar, dpdpVar, i)) {
                return maneuvers$ManeuverArr[i2];
            }
            i2++;
        }
        return maneuvers$ManeuverArr[i2];
    }
}
