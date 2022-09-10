package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: PG */
/* renamed from: ckjl  reason: default package */
/* loaded from: classes4.dex */
public final class ckjl {
    private static final Map<String, String> a;
    private static final ConcurrentHashMap<String, ckjj> b;
    private static final ckjj c;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        b = new ConcurrentHashMap<>();
        c = new ckjj();
        hashMap.put(dryv.class.getName(), "ChimeFetchLatestThreads");
        hashMap.put(dryz.class.getName(), "ChimeFetchThreadsById");
        hashMap.put(drze.class.getName(), "ChimeFetchUpdatedThreads");
        hashMap.put(drzu.class.getName(), "ChimeStoreTarget");
        hashMap.put(drzm.class.getName(), "ChimeRemoveTarget");
        hashMap.put(dryn.class.getName(), "ChimeCreateUserSubscription");
        hashMap.put(dryr.class.getName(), "ChimeDeleteUserSubscription");
        hashMap.put(drzi.class.getName(), "ChimeFetchUserPreferences");
        hashMap.put(drzq.class.getName(), "ChimeSetUserPreference");
        hashMap.put(drzy.class.getName(), "ChimeUpdateThreadStateByToken");
        hashMap.put(dryj.class.getName(), "ChimeBatchUpdateThreadState");
        hashMap.put(dwyl.class.getName(), "ApiQuotaEvent");
        hashMap.put(dwyz.class.getName(), "Elevation");
        hashMap.put(dxdk.class.getName(), "MapTile");
        hashMap.put(dxcw.class.getName(), "MapPerTile");
        hashMap.put(dxai.class.getName(), "Resource");
        hashMap.put(dxco.class.getName(), "Sync");
        hashMap.put(dukl.class.getName(), "AppStart");
        hashMap.put(dunb.class.getName(), "ClientParameters");
        hashMap.put(dwbq.class.getName(), "DirectionsAssist");
        hashMap.put(duqn.class.getName(), "ExternalInvocation");
        hashMap.put(dusu.class.getName(), "GunsFetchNotificationsByKey");
        hashMap.put(diji.class.getName(), "KnowledgeDetails");
        hashMap.put(dipx.class.getName(), "LocalStory");
        hashMap.put(dlao.class.getName(), "LocalStreamFollow");
        hashMap.put(diqx.class.getName(), "LocalStreamListFollowEntities");
        hashMap.put(disd.class.getName(), "LocationEventBatch");
        hashMap.put(duyo.class.getName(), "MapsActivitiesCardList");
        hashMap.put(dwgv.class.getName(), "PlaceAttributeUpdate");
        hashMap.put(diwn.class.getName(), "PlaceListFollow");
        hashMap.put(diwr.class.getName(), "PlaceListGet");
        hashMap.put(diwv.class.getName(), "PlaceListShare");
        hashMap.put(dvpf.class.getName(), "ReportTrack");
        hashMap.put(dvpb.class.getName(), "ReportTrackParameters");
        hashMap.put(dvng.class.getName(), "Starring");
        hashMap.put(dvto.class.getName(), "StartPage");
        hashMap.put(djvw.class.getName(), "TrafficToPlaceNotification");
        hashMap.put(dkdw.class.getName(), "UserToUserBlocking");
        hashMap.put(dwuv.class.getName(), "UserInfo");
        hashMap.put(dwup.class.getName(), "UserEvent3");
        hashMap.put(dwxn.class.getName(), "YourPlaces");
        hashMap.put(djos.class.getName(), "ReportNavigationSessionEvents");
        hashMap.put(dhkf.class.getName(), "BlockAdDomain");
        hashMap.put(djio.class.getName(), "ListPromotedPinAds");
        hashMap.put(dukb.class.getName(), "ListAliasSticker");
        hashMap.put(dvvi.class.getName(), "UpdateAlias");
        hashMap.put(djwe.class.getName(), "GetUserStream");
        hashMap.put(diet.class.getName(), "GetProxyPhoneNumber");
        hashMap.put(dhzs.class.getName(), "GetCallInsights");
        hashMap.put(diki.class.getName(), "ListCallDetails");
        hashMap.put(dikm.class.getName(), "ListCallSurveys");
        hashMap.put(dkay.class.getName(), "UpdateListingCallsStatus");
        hashMap.put(dhzw.class.getName(), "GetCallTranscript");
        hashMap.put(dhtm.class.getName(), "DeleteCallRecord");
        hashMap.put(dhnf.class.getName(), "GetBusinessCategories");
        hashMap.put(dhzo.class.getName(), "GetBusinessMessagingState");
        hashMap.put(dhws.class.getName(), "EnableBusinessMessaging");
        hashMap.put(dhvs.class.getName(), "DisableBusinessMessaging");
        hashMap.put(dhzk.class.getName(), "GetBatchBusinessMessagingState");
        hashMap.put(dicg.class.getName(), "GetMessagingAutoEnableState");
        hashMap.put(dkbg.class.getName(), "UpdateMessagingPreference");
        hashMap.put(dvvu.class.getName(), "ListCategories");
        hashMap.put(diaa.class.getName(), "GetCommuteImmersiveContent");
        hashMap.put(dhnn.class.getName(), "CancelCommuteNotificationSession");
        hashMap.put(dhkn.class.getName(), "AllowCommuteNotificationSession");
        hashMap.put(dvjt.class.getName(), "WriteContact");
        hashMap.put(dvjp.class.getName(), "GetContact");
        hashMap.put(dvjl.class.getName(), "AutocompleteContacts");
        hashMap.put(dhwa.class.getName(), "DismissUgcInfoCard");
        hashMap.put(diae.class.getName(), "GetContributorZoneContent");
        hashMap.put(dhwm.class.getName(), "EditCreatorProfile");
        hashMap.put(diai.class.getName(), "GetCreatorProfile");
        hashMap.put(dwaw.class.getName(), "GetDirections");
        hashMap.put(djzw.class.getName(), "UpdateDiscoveryPrefs");
        hashMap.put(dhtq.class.getName(), "DeleteListCustomData");
        hashMap.put(dkaa.class.getName(), "UpdateListCustomData");
        hashMap.put(dhqa.class.getName(), "CreateListCustomData");
        hashMap.put(diaw.class.getName(), "GetListMetadata");
        hashMap.put(djru.class.getName(), "ShareList");
        hashMap.put(dkaq.class.getName(), "UpdateListRole");
        hashMap.put(dkau.class.getName(), "UpdateListVisibility");
        hashMap.put(dhqe.class.getName(), "CreateListItemCustomData");
        hashMap.put(dhtu.class.getName(), "DeleteListItemCustomData");
        hashMap.put(dibo.class.getName(), "GetList");
        hashMap.put(diam.class.getName(), "GetListHeroImages");
        hashMap.put(dibg.class.getName(), "GetListParticipants");
        hashMap.put(dhqm.class.getName(), "CreateList");
        hashMap.put(dhuc.class.getName(), "DeleteList");
        hashMap.put(dhty.class.getName(), "DeleteListItem");
        hashMap.put(dhqi.class.getName(), "CreateListItem");
        hashMap.put(dkam.class.getName(), "UpdateList");
        hashMap.put(dile.class.getName(), "ListLists");
        hashMap.put(dims.class.getName(), "ListUserPublicLists");
        hashMap.put(dkae.class.getName(), "UpdateListItemCustomData");
        hashMap.put(dkai.class.getName(), "UpdateListItem");
        hashMap.put(dibk.class.getName(), "GetRecommendations");
        hashMap.put(dhoz.class.getName(), "GetCinemaData");
        hashMap.put(dils.class.getName(), "ListExperiences");
        hashMap.put(dhyh.class.getName(), "GetExploreContent");
        hashMap.put(dkem.class.getName(), "GetVisualExplorePhotos");
        hashMap.put(dilk.class.getName(), "ListEvConnectorTypes");
        hashMap.put(dilo.class.getName(), "ListEvPaymentNetworks");
        hashMap.put(dibs.class.getName(), "GetExhaustiveSearch");
        hashMap.put(dwbw.class.getName(), "Geocode");
        hashMap.put(dwcw.class.getName(), "GetLocationDetails");
        hashMap.put(dwhf.class.getName(), "Reveal");
        hashMap.put(dhqq.class.getName(), "CreateCookie");
        hashMap.put(diji.class.getName(), "GetKnowledgeEntity");
        hashMap.put(dijr.class.getName(), "EditKnowledgeEntity");
        hashMap.put(dijv.class.getName(), "ListKnowledgeEntityEditSummaries");
        hashMap.put(dijz.class.getName(), "KnowledgeEntityFeedback");
        hashMap.put(duvu.class.getName(), "UpdateLocalGuidePrefs");
        hashMap.put(duvz.class.getName(), "GetLocalGuideSignUpPage");
        hashMap.put(dipt.class.getName(), "ListLocalPosts");
        hashMap.put(dija.class.getName(), "InstoreSuggest");
        hashMap.put(dirb.class.getName(), "GetLocalStream");
        hashMap.put(dlbm.class.getName(), "SendFeedback");
        hashMap.put(dlbi.class.getName(), "DeleteCard");
        hashMap.put(diqx.class.getName(), "ListFollowEntities");
        hashMap.put(dirf.class.getName(), "UpdateAreas");
        hashMap.put(diqj.class.getName(), "DeleteTripDestinations");
        hashMap.put(diqr.class.getName(), "EnablePlaceLists");
        hashMap.put(diqn.class.getName(), "DisablePlaceLists");
        hashMap.put(diqb.class.getName(), "CreateMutedPlaces");
        hashMap.put(diqf.class.getName(), "DeleteMutedPlaces");
        hashMap.put(dlbq.class.getName(), "VerifyArea");
        hashMap.put(dwjd.class.getName(), "SnapToPlace");
        hashMap.put(dwzw.class.getName(), "GetLocationShift");
        hashMap.put(dwdg.class.getName(), "MobileMapsLocationSharingGetState");
        hashMap.put(dhnr.class.getName(), "MobileMapsLocationSharingCancelSharedJourney");
        hashMap.put(dkbo.class.getName(), "MobileMapsLocationSharingUpdateSharedJourney");
        hashMap.put(ditc.class.getName(), "MobileMapsLocationSharingRecordConsent");
        hashMap.put(ditm.class.getName(), "MobileMapsLocationSharingUploadLocation");
        hashMap.put(ditg.class.getName(), "MobileMapsLocationSharingUpdateShare");
        hashMap.put(disj.class.getName(), "MobileMapsLocationSharingAskForLocation");
        hashMap.put(dhsa.class.getName(), "MobileMapsLocationSharingCreateSharedJourney");
        hashMap.put(dwdc.class.getName(), "MobileMapsLocationSharingCancelShares");
        hashMap.put(dist.class.getName(), "MobileMapsLocationSharingCreateShares");
        hashMap.put(dick.class.getName(), "GetNavigationSatelliteEphemeris");
        hashMap.put(dimg.class.getName(), "MobileMapsNotificationListNotifications");
        hashMap.put(dkbk.class.getName(), "MobileMapsNotificationUpdateNotifications");
        hashMap.put(dutm.class.getName(), "MobileMapsNotificationRegisterDevice");
        hashMap.put(dutu.class.getName(), "MobileMapsNotificationUnregisterDevice");
        hashMap.put(dvct.class.getName(), "GetMap");
        hashMap.put(dvcd.class.getName(), "ListFeatures");
        hashMap.put(dimc.class.getName(), "ListRecommendations");
        hashMap.put(dhvw.class.getName(), "DismissRecommendation");
        hashMap.put(dhmv.class.getName(), "BatchGetListingMetadata");
        hashMap.put(dilw.class.getName(), "ListBusinessSummaries");
        hashMap.put(dhra.class.getName(), "CreateOfferings");
        hashMap.put(dhum.class.getName(), "DeleteOfferings");
        hashMap.put(dico.class.getName(), "GetOfferingDetails");
        hashMap.put(djox.class.getName(), "ReportOfferingProblem");
        hashMap.put(djsv.class.getName(), "SubmitOfferingRecommendations");
        hashMap.put(djtr.class.getName(), "SuggestOfferings");
        hashMap.put(dvfk.class.getName(), "UpdateOfflineMaps");
        hashMap.put(dvgc.class.getName(), "GetOfflineMapSize");
        hashMap.put(dviq.class.getName(), "GetContent");
        hashMap.put(djok.class.getName(), "RejectCreatorRecommendation");
        hashMap.put(djoo.class.getName(), "RejectFollower");
        hashMap.put(dhkt.class.getName(), "ApproveFollower");
        hashMap.put(dics.class.getName(), "GetCreatorRecommendations");
        hashMap.put(dimm.class.getName(), "ListFollows");
        hashMap.put(djzs.class.getName(), "UnfollowPeople");
        hashMap.put(dhyu.class.getName(), "FollowPeople");
        hashMap.put(dicy.class.getName(), "GetPeopleFollowInfo");
        hashMap.put(dvkd.class.getName(), "UpdatePersonalNotes");
        hashMap.put(dwdk.class.getName(), "UpdatePersonalIntelligence");
        hashMap.put(dvor.class.getName(), "GetActivitySource");
        hashMap.put(dvoj.class.getName(), "DeleteActivity");
        hashMap.put(dhlp.class.getName(), "AssociatePhoto");
        hashMap.put(dhva.class.getName(), "DeletePhoto");
        hashMap.put(dupe.class.getName(), "DismissPrivatePhoto");
        hashMap.put(dwge.class.getName(), "ListEntityPhotos");
        hashMap.put(dwnd.class.getName(), "ListPrivatePhotos");
        hashMap.put(dkdg.class.getName(), "ListUserPhotos");
        hashMap.put(dwgr.class.getName(), "TakedownPhoto");
        hashMap.put(dwvf.class.getName(), "UpdatePhoto");
        hashMap.put(dizr.class.getName(), "VotePhoto");
        hashMap.put(dvzj.class.getName(), "GetPlace");
        hashMap.put(didc.class.getName(), "GetPlaceInsights");
        hashMap.put(djcq.class.getName(), "GetPlaceVisitStats");
        hashMap.put(didg.class.getName(), "MobileMapsPlaceQaGetSmartAnswers");
        hashMap.put(djax.class.getName(), "MobileMapsPlaceQaGetPlaceQaReplies");
        hashMap.put(dkez.class.getName(), "MobileMapsPlaceQaWriteReply");
        hashMap.put(djbb.class.getName(), "MobileMapsPlaceQaGetPlaceQa");
        hashMap.put(djbl.class.getName(), "MobileMapsPlaceQaListUserContributions");
        hashMap.put(djrg.class.getName(), "MobileMapsPlaceQaSetBestAnswer");
        hashMap.put(djcg.class.getName(), "MobileMapsPlaceQaVotePlaceQa");
        hashMap.put(djaa.class.getName(), "MobileMapsPlaceQaWriteAnswer");
        hashMap.put(djar.class.getName(), "MobileMapsPlaceQaWriteQuestion");
        hashMap.put(diea.class.getName(), "GetQuestions");
        hashMap.put(dkfh.class.getName(), "WriteAnswer");
        hashMap.put(dhri.class.getName(), "CreateReceipt");
        hashMap.put(dhwi.class.getName(), "DonateReceipt");
        hashMap.put(dlxy.class.getName(), "UpdateReceiptUserConsent");
        hashMap.put(diez.class.getName(), "GetReceiptUserConsent");
        hashMap.put(dixa.class.getName(), "MarkPhotoAsReceipt");
        hashMap.put(dkzf.class.getName(), "ListRecommendedPlaces");
        hashMap.put(dvpl.class.getName(), "CreateReservation");
        hashMap.put(dvpp.class.getName(), "SearchAvailability");
        hashMap.put(dvqa.class.getName(), "DeleteReview");
        hashMap.put(difj.class.getName(), "GetReviews");
        hashMap.put(dwhl.class.getName(), "ListEntityReviews");
        hashMap.put(dwvz.class.getName(), "ListUserReviews");
        hashMap.put(djvf.class.getName(), "ThumbVote");
        hashMap.put(dvqj.class.getName(), "WriteReview");
        hashMap.put(dvrc.class.getName(), "MobileMapsRiddlerListFollowOnQuestions");
        hashMap.put(dwcs.class.getName(), "MobileMapsRiddlerWriteAnswer");
        hashMap.put(dlzm.class.getName(), "GetTripEstimates");
        hashMap.put(dlzu.class.getName(), "GetUserConsent");
        hashMap.put(dmao.class.getName(), "UpdateUserConsent");
        hashMap.put(dwir.class.getName(), "Search");
        hashMap.put(djrc.class.getName(), "SendShare");
        hashMap.put(dhzg.class.getName(), "GetAreaShoppingData");
        hashMap.put(dwjn.class.getName(), "Suggest");
        hashMap.put(duyc.class.getName(), "CreateTimelineEdit");
        hashMap.put(duxy.class.getName(), "DeleteLocationHistory");
        hashMap.put(dvbj.class.getName(), "GetTimelineSegment");
        hashMap.put(duzc.class.getName(), "GetTimeline");
        hashMap.put(dign.class.getName(), "GetTimelineEntryPoints");
        hashMap.put(dixk.class.getName(), "GetMultiTodoList");
        hashMap.put(dimw.class.getName(), "ListTodoBundles");
        hashMap.put(dwco.class.getName(), "DismissTodoItem");
        hashMap.put(dwmp.class.getName(), "GetTodoList");
        hashMap.put(dkcw.class.getName(), "MobileMapsTrafficWriteTrafficIncident");
        hashMap.put(dwnn.class.getName(), "MobileMapsTrafficGetTrafficIncident");
        hashMap.put(dhlj.class.getName(), "MobileMapsTrafficGetAreaTraffic");
        hashMap.put(dkfn.class.getName(), "MobileMapsTrafficCreateAreaTrafficNotification");
        hashMap.put(djpm.class.getName(), "ReportTransitAttributes");
        hashMap.put(digt.class.getName(), "GetTransitAttributeQuestions");
        hashMap.put(digz.class.getName(), "GetTransitPolylines");
        hashMap.put(djqw.class.getName(), "SearchTransitStations");
        hashMap.put(djxc.class.getName(), "DescribeTransitPattern");
        hashMap.put(djya.class.getName(), "MergeSegments");
        hashMap.put(djxs.class.getName(), "ListLines");
        hashMap.put(diby.class.getName(), "GetGoogleWalletTransitCard");
        hashMap.put(dwod.class.getName(), "GetTrip");
        hashMap.put(djwy.class.getName(), "CreateCrowdednessFeedback");
        hashMap.put(djyy.class.getName(), "GetStation");
        hashMap.put(dhkj.class.getName(), "GetAddressFeedback");
        hashMap.put(difr.class.getName(), "GetRoadEditingTiles");
        hashMap.put(dige.class.getName(), "GetRoadRapInfo");
        hashMap.put(diku.class.getName(), "ListEditableFeatures");
        hashMap.put(dkcs.class.getName(), "ListUserFactualEdits");
        hashMap.put(dwgz.class.getName(), "ReportProblem");
        hashMap.put(duoz.class.getName(), "DismissNotification");
        hashMap.put(dwjv.class.getName(), "VoteOnEdit");
        hashMap.put(dhsg.class.getName(), "CreateUgcPost");
        hashMap.put(dhvg.class.getName(), "DeleteUgcPost");
        hashMap.put(dihn.class.getName(), "GetUgcPost");
        hashMap.put(dinq.class.getName(), "ListUgcPosts");
        hashMap.put(dkck.class.getName(), "UpdateUgcPost");
        hashMap.put(dkeq.class.getName(), "VoteUgcPost");
        hashMap.put(dhre.class.getName(), "CreateOrUpdateOwnerResponseToUgcPost");
        hashMap.put(dhuw.class.getName(), "DeleteOwnerResponseToUgcPost");
        hashMap.put(dihj.class.getName(), "GetUgcPostEditorInfo");
        hashMap.put(dhsk.class.getName(), "CreatePlaceReminder");
        hashMap.put(dhvk.class.getName(), "DeletePlaceReminder");
        hashMap.put(dihr.class.getName(), "GetPlaceReminders");
        hashMap.put(djzm.class.getName(), "CreateAnswer");
        hashMap.put(dupi.class.getName(), "DismissTask");
        hashMap.put(dwsn.class.getName(), "ListTasks");
        hashMap.put(dhru.class.getName(), "CreateShareableUrl");
        hashMap.put(dvta.class.getName(), "CreateShortUrl");
        hashMap.put(djhq.class.getName(), "GetPostContributionThanksPage");
        hashMap.put(dwtm.class.getName(), "ListUserContributions");
        hashMap.put(dwvn.class.getName(), "GetUserPrefs");
        hashMap.put(dwvr.class.getName(), "WriteUserPrefs");
        hashMap.put(dwjr.class.getName(), "GetViewportMetadata");
        hashMap.put(djti.class.getName(), "SubmitUgcContentFeedback");
        hashMap.put(dmxh.class.getName(), "PaintTile");
        hashMap.put(dmxd.class.getName(), "PaintParameters");
        hashMap.put(buff.class.getName(), "ReportAdEvent");
    }

    @dzsi
    public static ckha a(Class<? extends dssj> cls) {
        return b(cls).g;
    }

    public static ckjj b(Class<? extends dssj> cls) {
        String name = cls.getName();
        ConcurrentHashMap<String, ckjj> concurrentHashMap = b;
        ckjj ckjjVar = concurrentHashMap.get(name);
        if (ckjjVar != null) {
            return ckjjVar;
        }
        String str = a.get(name);
        if (str == null) {
            return c;
        }
        ckjj ckjjVar2 = new ckjj(str);
        concurrentHashMap.put(name, ckjjVar2);
        return ckjjVar2;
    }
}
